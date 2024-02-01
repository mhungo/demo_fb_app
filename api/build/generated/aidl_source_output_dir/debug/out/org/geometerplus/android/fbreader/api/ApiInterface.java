/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.geometerplus.android.fbreader.api;
public interface ApiInterface extends android.os.IInterface
{
  /** Default implementation for ApiInterface. */
  public static class Default implements org.geometerplus.android.fbreader.api.ApiInterface
  {
    @Override public org.geometerplus.android.fbreader.api.ApiObject request(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<org.geometerplus.android.fbreader.api.ApiObject> requestList(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.Map requestMap(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.geometerplus.android.fbreader.api.ApiInterface
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.geometerplus.android.fbreader.api.ApiInterface interface,
     * generating a proxy if needed.
     */
    public static org.geometerplus.android.fbreader.api.ApiInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.geometerplus.android.fbreader.api.ApiInterface))) {
        return ((org.geometerplus.android.fbreader.api.ApiInterface)iin);
      }
      return new org.geometerplus.android.fbreader.api.ApiInterface.Stub.Proxy(obj);
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
        case TRANSACTION_request:
        {
          int _arg0;
          _arg0 = data.readInt();
          org.geometerplus.android.fbreader.api.ApiObject[] _arg1;
          _arg1 = data.createTypedArray(org.geometerplus.android.fbreader.api.ApiObject.CREATOR);
          org.geometerplus.android.fbreader.api.ApiObject _result = this.request(_arg0, _arg1);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_requestList:
        {
          int _arg0;
          _arg0 = data.readInt();
          org.geometerplus.android.fbreader.api.ApiObject[] _arg1;
          _arg1 = data.createTypedArray(org.geometerplus.android.fbreader.api.ApiObject.CREATOR);
          java.util.List<org.geometerplus.android.fbreader.api.ApiObject> _result = this.requestList(_arg0, _arg1);
          reply.writeNoException();
          reply.writeTypedList(_result);
          break;
        }
        case TRANSACTION_requestMap:
        {
          int _arg0;
          _arg0 = data.readInt();
          org.geometerplus.android.fbreader.api.ApiObject[] _arg1;
          _arg1 = data.createTypedArray(org.geometerplus.android.fbreader.api.ApiObject.CREATOR);
          java.util.Map _result = this.requestMap(_arg0, _arg1);
          reply.writeNoException();
          reply.writeMap(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements org.geometerplus.android.fbreader.api.ApiInterface
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
      @Override public org.geometerplus.android.fbreader.api.ApiObject request(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.geometerplus.android.fbreader.api.ApiObject _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(method);
          _data.writeTypedArray(parameters, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_request, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, org.geometerplus.android.fbreader.api.ApiObject.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<org.geometerplus.android.fbreader.api.ApiObject> requestList(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<org.geometerplus.android.fbreader.api.ApiObject> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(method);
          _data.writeTypedArray(parameters, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestList, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArrayList(org.geometerplus.android.fbreader.api.ApiObject.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.Map requestMap(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.Map _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(method);
          _data.writeTypedArray(parameters, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestMap, _data, _reply, 0);
          _reply.readException();
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _result = _reply.readHashMap(cl);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_request = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_requestList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_requestMap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  public static final java.lang.String DESCRIPTOR = "org.geometerplus.android.fbreader.api.ApiInterface";
  public org.geometerplus.android.fbreader.api.ApiObject request(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException;
  public java.util.List<org.geometerplus.android.fbreader.api.ApiObject> requestList(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException;
  public java.util.Map requestMap(int method, org.geometerplus.android.fbreader.api.ApiObject[] parameters) throws android.os.RemoteException;
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
