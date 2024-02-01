/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.geometerplus.android.fbreader.config;
public interface ConfigInterface extends android.os.IInterface
{
  /** Default implementation for ConfigInterface. */
  public static class Default implements org.geometerplus.android.fbreader.config.ConfigInterface
  {
    @Override public java.util.List<java.lang.String> listGroups() throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<java.lang.String> listNames(java.lang.String group) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.lang.String getValue(java.lang.String group, java.lang.String name) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setValue(java.lang.String group, java.lang.String name, java.lang.String value) throws android.os.RemoteException
    {
    }
    @Override public void unsetValue(java.lang.String group, java.lang.String name) throws android.os.RemoteException
    {
    }
    @Override public void removeGroup(java.lang.String name) throws android.os.RemoteException
    {
    }
    @Override public java.util.List<java.lang.String> requestAllValuesForGroup(java.lang.String group) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.geometerplus.android.fbreader.config.ConfigInterface
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.geometerplus.android.fbreader.config.ConfigInterface interface,
     * generating a proxy if needed.
     */
    public static org.geometerplus.android.fbreader.config.ConfigInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.geometerplus.android.fbreader.config.ConfigInterface))) {
        return ((org.geometerplus.android.fbreader.config.ConfigInterface)iin);
      }
      return new org.geometerplus.android.fbreader.config.ConfigInterface.Stub.Proxy(obj);
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
        case TRANSACTION_listGroups:
        {
          java.util.List<java.lang.String> _result = this.listGroups();
          reply.writeNoException();
          reply.writeStringList(_result);
          break;
        }
        case TRANSACTION_listNames:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.util.List<java.lang.String> _result = this.listNames(_arg0);
          reply.writeNoException();
          reply.writeStringList(_result);
          break;
        }
        case TRANSACTION_getValue:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _result = this.getValue(_arg0, _arg1);
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_setValue:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          this.setValue(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_unsetValue:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.unsetValue(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_removeGroup:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.removeGroup(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_requestAllValuesForGroup:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.util.List<java.lang.String> _result = this.requestAllValuesForGroup(_arg0);
          reply.writeNoException();
          reply.writeStringList(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements org.geometerplus.android.fbreader.config.ConfigInterface
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
      @Override public java.util.List<java.lang.String> listGroups() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_listGroups, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<java.lang.String> listNames(java.lang.String group) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(group);
          boolean _status = mRemote.transact(Stub.TRANSACTION_listNames, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String getValue(java.lang.String group, java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(group);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getValue, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setValue(java.lang.String group, java.lang.String name, java.lang.String value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(group);
          _data.writeString(name);
          _data.writeString(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setValue, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void unsetValue(java.lang.String group, java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(group);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unsetValue, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void removeGroup(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeGroup, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.util.List<java.lang.String> requestAllValuesForGroup(java.lang.String group) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(group);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestAllValuesForGroup, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_listGroups = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_listNames = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_setValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_unsetValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_removeGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_requestAllValuesForGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
  }
  public static final java.lang.String DESCRIPTOR = "org.geometerplus.android.fbreader.config.ConfigInterface";
  public java.util.List<java.lang.String> listGroups() throws android.os.RemoteException;
  public java.util.List<java.lang.String> listNames(java.lang.String group) throws android.os.RemoteException;
  public java.lang.String getValue(java.lang.String group, java.lang.String name) throws android.os.RemoteException;
  public void setValue(java.lang.String group, java.lang.String name, java.lang.String value) throws android.os.RemoteException;
  public void unsetValue(java.lang.String group, java.lang.String name) throws android.os.RemoteException;
  public void removeGroup(java.lang.String name) throws android.os.RemoteException;
  public java.util.List<java.lang.String> requestAllValuesForGroup(java.lang.String group) throws android.os.RemoteException;
}
