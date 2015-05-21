package im.actor.model.api.rpc;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.Bser;
import im.actor.model.droidkit.bser.BserParser;
import im.actor.model.droidkit.bser.BserObject;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import im.actor.model.droidkit.bser.DataInput;
import im.actor.model.droidkit.bser.DataOutput;
import im.actor.model.droidkit.bser.util.SparseArray;
import static im.actor.model.droidkit.bser.Utils.*;
import java.io.IOException;
import im.actor.model.network.parser.*;
import java.util.List;
import java.util.ArrayList;
import im.actor.model.api.*;

public class RequestRegisterGooglePush extends Request<ResponseVoid> {

    public static final int HEADER = 0x33;
    public static RequestRegisterGooglePush fromBytes(byte[] data) throws IOException {
        return Bser.parse(new RequestRegisterGooglePush(), data);
    }

    private long projectId;
    private String token;

    public RequestRegisterGooglePush(long projectId, String token) {
        this.projectId = projectId;
        this.token = token;
    }

    public RequestRegisterGooglePush() {

    }

    public long getProjectId() {
        return this.projectId;
    }

    public String getToken() {
        return this.token;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.projectId = values.getLong(1);
        this.token = values.getString(2);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeLong(1, this.projectId);
        if (this.token == null) {
            throw new IOException();
        }
        writer.writeString(2, this.token);
    }

    @Override
    public String toString() {
        String res = "rpc RegisterGooglePush{";
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
