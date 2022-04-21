package com.example.mymoviewdb.components;

import java.lang.System;

/**
 * A CSS like shadow
 */
@kotlin.Suppress(names = {"PropertyName"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0083\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010k\u001a\u00020lH\u0002J\u0012\u0010m\u001a\u00020l2\b\u0010n\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010o\u001a\u00020pH\u0016J\u0014\u0010q\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020:0rH\u0002J\b\u0010s\u001a\u00020lH\u0014J\b\u0010t\u001a\u00020lH\u0014J(\u0010u\u001a\u00020l2\u0006\u0010v\u001a\u00020\u00072\u0006\u0010w\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u0007H\u0014J\u0010\u0010z\u001a\u00020l2\b\b\u0001\u0010{\u001a\u00020\u0007J\u0018\u0010|\u001a\u00020l2\u0006\u0010}\u001a\u00020\u00072\u0006\u0010~\u001a\u00020\u0007H\u0002J\u0011\u0010\u007f\u001a\u00020l2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u0007J\u0012\u0010\u0081\u0001\u001a\u00020l2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u0007J\t\u0010\u0082\u0001\u001a\u00020lH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u000e\u001a\u00020\u000f8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0012\u001a\u00020\u000f8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0018\u001a\u00020\u000f8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0015\u0010\u001a\u001a\u00020\u000f8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010%R\u0012\u0010&\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010%R\u0012\u0010\'\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010%R\u0012\u0010(\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010%R\u0010\u0010)\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0017R\u0014\u00100\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u0017R+\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00158B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u00106R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010=\u001a\u00020$2\u0006\u00102\u001a\u00020$8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bB\u00108\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bE\u0010-\"\u0004\bF\u0010GR+\u0010H\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bK\u00108\u001a\u0004\bI\u0010\u0017\"\u0004\bJ\u00106R+\u0010L\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bO\u00108\u001a\u0004\bM\u0010\u0017\"\u0004\bN\u00106R+\u0010P\u001a\u00020$2\u0006\u00102\u001a\u00020$8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bS\u00108\u001a\u0004\bQ\u0010?\"\u0004\bR\u0010AR+\u0010T\u001a\u00020$2\u0006\u00102\u001a\u00020$8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bW\u00108\u001a\u0004\bU\u0010?\"\u0004\bV\u0010AR+\u0010X\u001a\u00020$2\u0006\u00102\u001a\u00020$8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b[\u00108\u001a\u0004\bY\u0010?\"\u0004\bZ\u0010AR+\u0010\\\u001a\u00020$2\u0006\u00102\u001a\u00020$8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b_\u00108\u001a\u0004\b]\u0010?\"\u0004\b^\u0010AR+\u0010`\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bc\u00108\u001a\u0004\ba\u0010\u0017\"\u0004\bb\u00106R+\u0010d\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bg\u00108\u001a\u0004\be\u0010\u0017\"\u0004\bf\u00106R\u0015\u0010h\u001a\u00020\u000f8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bi\u0010\u0011R\u000e\u0010j\u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0084\u0001"}, d2 = {"Lcom/example/mymoviewdb/components/ShadowLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "blurBitmap", "Landroid/graphics/Bitmap;", "blurCanvas", "Landroid/graphics/Canvas;", "blurSMatrix", "Landroid/graphics/Matrix;", "getBlurSMatrix", "()Landroid/graphics/Matrix;", "blurTMatrix", "getBlurTMatrix", "cssRatio", "", "getCssRatio", "()F", "drawSMatrix", "getDrawSMatrix", "drawTMatrix", "getDrawTMatrix", "eraser", "Landroid/graphics/Paint;", "inAlloc", "Landroid/renderscript/Allocation;", "lastBounds", "Landroid/graphics/Rect;", "lastScale", "lastWithColorBitmap", "", "Ljava/lang/Boolean;", "lastWithColorScript", "lastWithCss", "lastWithDpi", "outAlloc", "paint", "pixelsOverBoundaries", "getPixelsOverBoundaries", "()I", "ratioDpToPixels", "getRatioDpToPixels", "ratioPixelsToDp", "getRatioPixelsToDp", "<set-?>", "realRadius", "getRealRadius", "setRealRadius", "(F)V", "realRadius$delegate", "Lcom/example/mymoviewdb/components/OnUpdate;", "renderScript", "Landroid/renderscript/RenderScript;", "script", "Landroid/renderscript/ScriptIntrinsicBlur;", "shadow_cast_only_background", "getShadow_cast_only_background", "()Z", "setShadow_cast_only_background", "(Z)V", "shadow_cast_only_background$delegate", "value", "shadow_color", "getShadow_color", "setShadow_color", "(I)V", "shadow_downscale", "getShadow_downscale", "setShadow_downscale", "shadow_downscale$delegate", "shadow_radius", "getShadow_radius", "setShadow_radius", "shadow_radius$delegate", "shadow_with_color", "getShadow_with_color", "setShadow_with_color", "shadow_with_color$delegate", "shadow_with_content", "getShadow_with_content", "setShadow_with_content", "shadow_with_content$delegate", "shadow_with_css_scale", "getShadow_with_css_scale", "setShadow_with_css_scale", "shadow_with_css_scale$delegate", "shadow_with_dpi_scale", "getShadow_with_dpi_scale", "setShadow_with_dpi_scale", "shadow_with_dpi_scale$delegate", "shadow_x_shift", "getShadow_x_shift", "setShadow_x_shift", "shadow_x_shift$delegate", "shadow_y_shift", "getShadow_y_shift", "setShadow_y_shift", "shadow_y_shift$delegate", "shiftTMatrix", "getShiftTMatrix", "viewBounds", "destroyBitmap", "", "draw", "canvas", "getOutlineProvider", "Landroid/view/ViewOutlineProvider;", "getScript", "Lkotlin/Pair;", "onAttachedToWindow", "onDetachedFromWindow", "onSizeChanged", "w", "h", "oldw", "oldh", "setColorRes", "color", "setViewBounds", "width", "height", "setXShift", "shift", "setYShift", "updateBitmap", "Companion", "app_debug"})
public final class ShadowLayout extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.mymoviewdb.components.ShadowLayout.Companion Companion = null;
    @kotlin.jvm.JvmField()
    public static final float ratioDpToPixels = 0.0F;
    @kotlin.jvm.JvmField()
    public static final float ratioPixelsToDp = 0.0F;
    public static final float cssRatio = 1.6666666F;
    private final android.graphics.Paint paint = null;
    private final android.graphics.Paint eraser = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mymoviewdb.components.OnUpdate shadow_x_shift$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mymoviewdb.components.OnUpdate shadow_y_shift$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mymoviewdb.components.OnUpdate shadow_downscale$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mymoviewdb.components.OnUpdate shadow_radius$delegate = null;
    private final com.example.mymoviewdb.components.OnUpdate realRadius$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mymoviewdb.components.OnUpdate shadow_cast_only_background$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mymoviewdb.components.OnUpdate shadow_with_content$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mymoviewdb.components.OnUpdate shadow_with_color$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mymoviewdb.components.OnUpdate shadow_with_dpi_scale$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mymoviewdb.components.OnUpdate shadow_with_css_scale$delegate = null;
    private final android.graphics.Rect viewBounds = null;
    private android.graphics.Bitmap blurBitmap;
    private android.graphics.Canvas blurCanvas;
    private android.renderscript.RenderScript renderScript;
    private android.renderscript.ScriptIntrinsicBlur script;
    private android.renderscript.Allocation inAlloc;
    private android.renderscript.Allocation outAlloc;
    private java.lang.Boolean lastWithColorScript;
    private final android.graphics.Rect lastBounds = null;
    private float lastScale = 0.0F;
    private java.lang.Boolean lastWithColorBitmap;
    private java.lang.Boolean lastWithDpi;
    private java.lang.Boolean lastWithCss;
    
    @kotlin.jvm.JvmOverloads()
    public ShadowLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ShadowLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ShadowLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ShadowLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    public final int getShadow_color() {
        return 0;
    }
    
    public final void setShadow_color(int value) {
    }
    
    public final void setColorRes(@androidx.annotation.ColorRes()
    int color) {
    }
    
    public final float getShadow_x_shift() {
        return 0.0F;
    }
    
    public final void setShadow_x_shift(float p0) {
    }
    
    public final void setXShift(@androidx.annotation.DimenRes()
    int shift) {
    }
    
    public final float getShadow_y_shift() {
        return 0.0F;
    }
    
    public final void setShadow_y_shift(float p0) {
    }
    
    public final void setYShift(@androidx.annotation.DimenRes()
    int shift) {
    }
    
    public final float getShadow_downscale() {
        return 0.0F;
    }
    
    public final void setShadow_downscale(float p0) {
    }
    
    public final float getShadow_radius() {
        return 0.0F;
    }
    
    public final void setShadow_radius(float p0) {
    }
    
    private final float getRealRadius() {
        return 0.0F;
    }
    
    private final void setRealRadius(float p0) {
    }
    
    public final boolean getShadow_cast_only_background() {
        return false;
    }
    
    public final void setShadow_cast_only_background(boolean p0) {
    }
    
    public final boolean getShadow_with_content() {
        return false;
    }
    
    public final void setShadow_with_content(boolean p0) {
    }
    
    public final boolean getShadow_with_color() {
        return false;
    }
    
    public final void setShadow_with_color(boolean p0) {
    }
    
    public final boolean getShadow_with_dpi_scale() {
        return false;
    }
    
    public final void setShadow_with_dpi_scale(boolean p0) {
    }
    
    public final boolean getShadow_with_css_scale() {
        return false;
    }
    
    public final void setShadow_with_css_scale(boolean p0) {
    }
    
    private final float getRatioDpToPixels() {
        return 0.0F;
    }
    
    private final float getRatioPixelsToDp() {
        return 0.0F;
    }
    
    private final float getCssRatio() {
        return 0.0F;
    }
    
    private final int getPixelsOverBoundaries() {
        return 0;
    }
    
    private final void setViewBounds(int width, int height) {
    }
    
    private final kotlin.Pair<android.renderscript.ScriptIntrinsicBlur, android.renderscript.RenderScript> getScript() {
        return null;
    }
    
    private final void updateBitmap() {
    }
    
    private final void destroyBitmap() {
    }
    
    /**
     * Cause the default elevation rendering to not work
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.ViewOutlineProvider getOutlineProvider() {
        return null;
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    private final android.graphics.Matrix getBlurTMatrix() {
        return null;
    }
    
    private final android.graphics.Matrix getBlurSMatrix() {
        return null;
    }
    
    private final android.graphics.Matrix getDrawTMatrix() {
        return null;
    }
    
    private final android.graphics.Matrix getDrawSMatrix() {
        return null;
    }
    
    private final android.graphics.Matrix getShiftTMatrix() {
        return null;
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/mymoviewdb/components/ShadowLayout$Companion;", "", "()V", "cssRatio", "", "ratioDpToPixels", "ratioPixelsToDp", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}