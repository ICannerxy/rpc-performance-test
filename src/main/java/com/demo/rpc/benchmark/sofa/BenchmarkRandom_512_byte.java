/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.demo.rpc.benchmark.sofa;

import com.alipay.sofa.ms.service.BenchmarkService;
import com.demo.rpc.benchmark.util.Strings;
import com.opensource.rpc.benchmark.AbstractBoltExchangeRunnable;
import com.opensource.rpc.benchmark.InvokeOption;

/**
 *
 * @author xingqi
 * @version $Id: BenchmarkRandom_512_byte.java, v 0.1 2020年05月09日 2:34 PM xingqi Exp $
 */
public class BenchmarkRandom_512_byte extends AbstractBoltExchangeRunnable {

    public BenchmarkRandom_512_byte(InvokeOption option) {
        super(option);
    }

    public Object doInvoke() {
        BenchmarkService benchmarkService = (BenchmarkService) serviceFactory.getReference(BenchmarkService.class);
        return benchmarkService.send_512_byte(Strings.randomString(512));
    }
}