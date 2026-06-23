# -------------------------------------------------------------------------
# TWA / androidbrowserhelper — keep everything, R8 must not touch these
# -------------------------------------------------------------------------
-keep class androidx.browser.** { *; }
-keepclassmembers class androidx.browser.** { *; }
-dontwarn androidx.browser.**

-keep class com.google.androidbrowserhelper.** { *; }
-keepclassmembers class com.google.androidbrowserhelper.** { *; }
-dontwarn com.google.androidbrowserhelper.**

# Preserve generic signatures and annotations used by the browser library
-keepattributes Signature
-keepattributes *Annotation*
-keepattributes Exceptions
