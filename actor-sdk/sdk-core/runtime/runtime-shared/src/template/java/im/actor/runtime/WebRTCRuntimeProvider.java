package im.actor.runtime;

import org.jetbrains.annotations.NotNull;

import im.actor.runtime.promise.Promise;
import im.actor.runtime.promise.Promises;
import im.actor.runtime.webrtc.WebRTCMediaStream;
import im.actor.runtime.webrtc.WebRTCPeerConnection;

public class WebRTCRuntimeProvider implements WebRTCRuntime {

    @Override
    @NotNull
    public Promise<WebRTCPeerConnection> createPeerConnection() {
        return Promises.failure(new RuntimeException("Dumb"));
    }

    @NotNull
    @Override
    public Promise<WebRTCMediaStream> getUserAudio() {
        return Promises.failure(new RuntimeException("Dumb"));
    }
}
