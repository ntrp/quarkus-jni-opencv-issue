package org.acme.getting.started;

import com.oracle.svm.core.annotate.AutomaticFeature;
import com.oracle.svm.core.jni.JNIRuntimeAccess;
import org.graalvm.nativeimage.hosted.Feature;
import org.opencv.core.Mat;

@AutomaticFeature
class JNIRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        try {
            JNIRuntimeAccess.register(Mat.class);
            JNIRuntimeAccess.register(Mat.class.getDeclaredMethod("zeros", int.class, int.class, int.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
