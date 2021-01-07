package com.demo.rpc.benchmark.dubbo; /**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */

import com.alipay.sofa.ms.service.BenchmarkService;
import com.demo.rpc.benchmark.util.Strings;
import com.opensource.rpc.benchmark.AbstractExchangeRunnable;
import com.opensource.rpc.benchmark.InvokeOption;

/**
 *
 * @author xingqi
 * @version $Id: com.demo.rpc.benchmark.dubbo.BenchmarkRandom_1k.java, v 0.1 2020年05月08日 2:46 PM xingqi Exp $
 */
public class BenchmarkRandom_1k extends AbstractExchangeRunnable {
    public BenchmarkRandom_1k(InvokeOption option) {
        super(option);
    }

    @Override
    public Object doInvoke() {
        /**
         * 通过serviceFactory获取接口proxy,
         * 如果返回值不为空并且没有异常抛出，认为调用成功.
         */
        BenchmarkService benchmarkService = (BenchmarkService) serviceFactory.getReference(BenchmarkService.class);
        return benchmarkService.send_1k(Strings.randomString(1024));
    }
}