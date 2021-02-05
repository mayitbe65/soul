/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.soul.metrics.api;

import org.dromara.soul.metrics.enums.MetricsTypeEnum;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Test for HistogramMetricsTracker default method.
 *
 * @author dengliming
 * @author Young Bean
 */
public class HistogramMetricsTrackerTest {

    private final HistogramMetricsTracker histogramMetricsTracker = () -> null;

    @Test
    public void metricsType() {
        assertThat(MetricsTypeEnum.HISTOGRAM.name(), equalTo(histogramMetricsTracker.metricsType()));
    }

    @Test
    public void startTimer() {
        HistogramMetricsTrackerDelegate histogramMetricsTrackerDelegate = histogramMetricsTracker.startTimer();
        assertNotNull(histogramMetricsTrackerDelegate);
        assertTrue(histogramMetricsTrackerDelegate instanceof NoneHistogramMetricsTrackerDelegate);
        histogramMetricsTrackerDelegate.observeDuration();
    }

    @Test
    public void observer() {
        histogramMetricsTracker.observer(1);
    }
}