/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.planner.core.score.buildin;

import org.drools.planner.core.score.Score;

import static org.junit.Assert.*;

public abstract class AbstractScoreTest {

    public static void assertLesser(Score a, Score b) {
        assertTrue("Score (" + a + ") must be lesser than score (" + b + ").", a.compareTo(b) < 0);
        assertTrue("Score (" + b + ") must be greater than score (" + a + ").", b.compareTo(a) > 0);
    }

    public static void assertGreater(Score a, Score b) {
        assertTrue("Score (" + a + ") must be greater than score (" + b + ").", a.compareTo(b) > 0);
        assertTrue("Score (" + b + ") must be lesser than score (" + a + ").", b.compareTo(a) < 0);
    }

    public static void assertScoreOrder(Score ... scores) {
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                assertLesser(scores[i], scores[j]);
            }
        }
    }

}