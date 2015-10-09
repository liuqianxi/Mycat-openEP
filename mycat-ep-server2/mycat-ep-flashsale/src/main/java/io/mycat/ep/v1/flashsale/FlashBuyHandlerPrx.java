// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.0
//
// <auto-generated>
//
// Generated from file `flashsale.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package io.mycat.ep.v1.flashsale;

public interface FlashBuyHandlerPrx extends Ice.ObjectPrx
{
    public FlashSaleResult flashBuy(FlashSaleInfo sale);

    public FlashSaleResult flashBuy(FlashSaleInfo sale, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_flashBuy(FlashSaleInfo sale);

    public Ice.AsyncResult begin_flashBuy(FlashSaleInfo sale, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_flashBuy(FlashSaleInfo sale, Ice.Callback __cb);

    public Ice.AsyncResult begin_flashBuy(FlashSaleInfo sale, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_flashBuy(FlashSaleInfo sale, Callback_FlashBuyHandler_flashBuy __cb);

    public Ice.AsyncResult begin_flashBuy(FlashSaleInfo sale, java.util.Map<String, String> __ctx, Callback_FlashBuyHandler_flashBuy __cb);

    public Ice.AsyncResult begin_flashBuy(FlashSaleInfo sale, 
                                          IceInternal.Functional_GenericCallback1<FlashSaleResult> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_flashBuy(FlashSaleInfo sale, 
                                          IceInternal.Functional_GenericCallback1<FlashSaleResult> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_flashBuy(FlashSaleInfo sale, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<FlashSaleResult> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_flashBuy(FlashSaleInfo sale, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<FlashSaleResult> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb);

    public FlashSaleResult end_flashBuy(Ice.AsyncResult __result);
}
