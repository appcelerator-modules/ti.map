/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-Present by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

#import "TiMapPinAnnotationView.h"
#import "TiMapView.h"
#import "TiMapAnnotationProxy.h"

@implementation TiMapPinAnnotationView

-(id)initWithAnnotation:(id<MKAnnotation>)annotation reuseIdentifier:(NSString *)reuseIdentifier map:(TiMapView*)map_
{
	if (self = [self initWithAnnotation:annotation reuseIdentifier:reuseIdentifier])
	{
		
	}
	return self;
}

-(NSString *)lastHitName
{
	NSString * result = lastHitName;
	lastHitName = nil;
	return result;
}


- (UIView *)hitTest:(CGPoint) point withEvent:(UIEvent *)event 
{
    UIView * result = [super hitTest:point withEvent:event];
	
	if (result==nil)
	{
		for (UIView * ourSubView in [self subviews])
		{
			CGPoint subPoint = [self convertPoint:point toView:ourSubView];
			for (UIView * ourSubSubView in [ourSubView subviews])
			{
				if (CGRectContainsPoint([ourSubSubView frame], subPoint) &&
					[ourSubSubView isKindOfClass:[UILabel class]])
				{
					NSString * labelText = [(UILabel *)ourSubSubView text];
					TiMapAnnotationProxy * ourProxy = (TiMapAnnotationProxy *)[self annotation];
					if ([labelText isEqualToString:[ourProxy title]])
					{
						lastHitName = @"title";
					}
					else if ([labelText isEqualToString:[ourProxy subtitle]])
					{
						lastHitName = @"subtitle";
					}

					return nil;
				}
			}
			if (CGRectContainsPoint([ourSubView bounds], subPoint))
			{
				lastHitName = @"annotation";
				return nil;
			}
		}
	}

    return result;
}

@end
