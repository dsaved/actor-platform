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

public class RequestSignUp extends Request<ResponseAuth> {

    public static final int HEADER = 0x4;
    public static RequestSignUp fromBytes(byte[] data) throws IOException {
        return Bser.parse(new RequestSignUp(), data);
    }

    private long phoneNumber;
    private String smsHash;
    private String smsCode;
    private String name;
    private byte[] deviceHash;
    private String deviceTitle;
    private int appId;
    private String appKey;
    private boolean isSilent;

    public RequestSignUp(long phoneNumber, String smsHash, String smsCode, String name, byte[] deviceHash, String deviceTitle, int appId, String appKey, boolean isSilent) {
        this.phoneNumber = phoneNumber;
        this.smsHash = smsHash;
        this.smsCode = smsCode;
        this.name = name;
        this.deviceHash = deviceHash;
        this.deviceTitle = deviceTitle;
        this.appId = appId;
        this.appKey = appKey;
        this.isSilent = isSilent;
    }

    public RequestSignUp() {

    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getSmsHash() {
        return this.smsHash;
    }

    public String getSmsCode() {
        return this.smsCode;
    }

    public String getName() {
        return this.name;
    }

    public byte[] getDeviceHash() {
        return this.deviceHash;
    }

    public String getDeviceTitle() {
        return this.deviceTitle;
    }

    public int getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public boolean isSilent() {
        return this.isSilent;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.phoneNumber = values.getLong(1);
        this.smsHash = values.getString(2);
        this.smsCode = values.getString(3);
        this.name = values.getString(4);
        this.deviceHash = values.getBytes(7);
        this.deviceTitle = values.getString(8);
        this.appId = values.getInt(9);
        this.appKey = values.getString(10);
        this.isSilent = values.getBool(11);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeLong(1, this.phoneNumber);
        if (this.smsHash == null) {
            throw new IOException();
        }
        writer.writeString(2, this.smsHash);
        if (this.smsCode == null) {
            throw new IOException();
        }
        writer.writeString(3, this.smsCode);
        if (this.name == null) {
            throw new IOException();
        }
        writer.writeString(4, this.name);
        if (this.deviceHash == null) {
            throw new IOException();
        }
        writer.writeBytes(7, this.deviceHash);
        if (this.deviceTitle == null) {
            throw new IOException();
        }
        writer.writeString(8, this.deviceTitle);
        writer.writeInt(9, this.appId);
        if (this.appKey == null) {
            throw new IOException();
        }
        writer.writeString(10, this.appKey);
        writer.writeBool(11, this.isSilent);
    }

    @Override
    public String toString() {
        String res = "rpc SignUp{";
        res += "name=" + this.name;
        res += ", deviceHash=" + byteArrayToString(this.deviceHash);
        res += ", deviceTitle=" + this.deviceTitle;
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
