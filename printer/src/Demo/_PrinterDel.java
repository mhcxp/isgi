// **********************************************************************
//
// Copyright (c) 2003-2008 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.3.0

package Demo;

public interface _PrinterDel extends Ice._ObjectDel
{
    void printString(String s, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
