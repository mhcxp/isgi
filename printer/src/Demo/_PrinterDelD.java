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

public final class _PrinterDelD extends Ice._ObjectDelD implements _PrinterDel
{
    public void
    printString(final String s, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        final Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "printString", Ice.OperationMode.Normal, __ctx);
        IceInternal.Direct __direct = null;
        try
        {
            __direct = new IceInternal.Direct(__current)
            {
                public Ice.DispatchStatus run(Ice.Object __obj)
                {
                    Printer __servant = null;
                    try
                    {
                        __servant = (Printer)__obj;
                    }
                    catch(ClassCastException __ex)
                    {
                        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
                    }
                    __servant.printString(s, __current);
                    return Ice.DispatchStatus.DispatchOK;
                }
            };
            try
            {
                Ice.DispatchStatus __status = __direct.servant().__collocDispatch(__direct);
                if(__status == Ice.DispatchStatus.DispatchUserException)
                {
                    __direct.throwUserException();
                }
                assert __status == Ice.DispatchStatus.DispatchOK;
            }
            finally
            {
                __direct.destroy();
            }
        }
        catch(Ice.SystemException __ex)
        {
            throw __ex;
        }
        catch(java.lang.Throwable __ex)
        {
            IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
        }
    }
}
