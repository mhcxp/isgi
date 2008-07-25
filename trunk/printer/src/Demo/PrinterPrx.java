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

public interface PrinterPrx extends Ice.ObjectPrx
{
    public void printString(String s);
    public void printString(String s, java.util.Map<String, String> __ctx);
}
