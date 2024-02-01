/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.geometerplus.android.fbreader.formatPlugin;
public interface CoverReader extends android.os.IInterface
{
  /** Default implementation for CoverReader. */
  public static class Default implements org.geometerplus.android.fbreader.formatPlugin.CoverReader
  {
    @Override public android.graphics.Bitmap readBitmap(java.lang.String path, int maxWidth, int maxHeight) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.geometerplus.android.fbreader.formatPlugin.CoverReader
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.geometerplus.android.fbreader.formatPlugin.CoverReader interface,
     * generating a proxy if needed.
     */
    public static org.geometerplus.android.fbreader.formatPlugin.CoverReader asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.geometerplus.android.fbreader.formatPlugin.CoverReader))) {
        return ((org.geometerplus.android.fbreader.formatPlugin.CoverReader)iin);
      }
      return new org.geometerplus.android.fbreader.formatPlugin.CoverReader.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_readBitmap:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          android.graphics.Bitmap _result = this.readBitmap(_arg0, _arg1, _arg2);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements org.geometerplus.android.fbreader.formatPlugin.CoverReader
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public android.graphics.Bitmap readBitmap(java.lang.String path, int maxWidth, int maxHeight) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.graphics.Bitmap _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(path);
          _data.writeInt(maxWidth);
          _data.writeInt(maxHeight);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readBitmap, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.graphics.Bitmap.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_readBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  public static final java.lang.String DESCRIPTOR = "org.geometerplus.android.fbreader.formatPlugin.CoverReader";
  public android.graphics.Bitmap readBitmap(java.lang.String path, int maxWidth, int maxHeight) throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
