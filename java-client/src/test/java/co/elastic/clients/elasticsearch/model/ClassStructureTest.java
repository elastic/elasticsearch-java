/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.model;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregate;
import co.elastic.clients.elasticsearch._types.aggregations.CardinalityAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.DateRangeAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.RangeBucket;
import co.elastic.clients.elasticsearch._types.query_dsl.IntervalsQuery;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.search.HitsMetadata;
import co.elastic.clients.elasticsearch.core.search.TotalHits;
import co.elastic.clients.elasticsearch.core.search.TotalHitsRelation;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.util.MissingRequiredPropertyException;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import org.junit.Test;

import javax.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;

/**
 * Tests that verify common features of generated classes.
 */
public class ClassStructureTest extends ModelTestCase {

    /**
     * Tests optional and required primitive types
     */
    @Test
    public void testPrimitiveTypes() throws Exception {
        // Optional primitive should use the boxed type and be @Nullable
        {
            Method searchSize = SearchRequest.class.getMethod("size");
            assertNotNull(searchSize.getAnnotation(Nullable.class));
            assertEquals(Integer.class, searchSize.getReturnType());
        }

        // Builder setter for optional primitive should use the boxed type and be @Nullable
        {
            Method searchBuilderSize = SearchRequest.Builder.class.getMethod("size", Integer.class);
            assertTrue(Arrays.stream(searchBuilderSize.getParameterAnnotations()[0])
                .anyMatch(a -> a.annotationType() == Nullable.class));
        }

        // Required primitive should use the primitive type and not be @Nullable
        {
            Method totalHitsValue = TotalHits.class.getMethod("value");
            assertNull(totalHitsValue.getAnnotation(Nullable.class));
            assertEquals(long.class, totalHitsValue.getReturnType());
        }

        // Builder setter for required primitive should use the primitive type and not be @Nullable
        {
            Method totalHitsBuilderValue = TotalHits.Builder.class.getMethod("value", long.class);
            assertFalse(Arrays.stream(totalHitsBuilderValue.getParameterAnnotations()[0])
                .anyMatch(a -> a.annotationType() == Nullable.class));
        }

        // Not setting a required primitive should throw an exception
        {
            assertThrows(MissingRequiredPropertyException.class, () -> TotalHits.of(b -> b));
        }
    }

    /**
     * Tests correct initialization of inherited fields through builders and data class inheritance.
     */
    @Test
    public void testDataClassInheritedFieldAssignment() {
        // 1 ancestor
        {
            CardinalityAggregate card = CardinalityAggregate.of(b -> b
                .meta(Collections.singletonMap("foo", JsonData.of("bar")))
                .value(1)
            );

            assertAncestorCount(1, card);
            assertEquals("bar", card.meta().get("foo").to(String.class));
            assertEquals("{\"meta\":{\"foo\":\"bar\"},\"value\":1}", toJson(card));
        }

        // 3 ancestors
        {
            DateRangeAggregate date = DateRangeAggregate.of(_1 -> _1
                .meta(Collections.singletonMap("foo", JsonData.of("bar")))
                .buckets(RangeBucket.of(_2 -> _2.docCount(1)))
            );

            assertAncestorCount(3, date);
            assertEquals("bar", date.meta().get("foo").to(String.class));
            assertEquals("{\"meta\":{\"foo\":\"bar\"},\"buckets\":[{\"doc_count\":1}]}", toJson(date));
        }
    }

    /**
     * Tests correct initialization of inherited fields for union typed.
     */
    @Test
    public void testUnionInheritedFieldAssignment() {
        IntervalsQuery iq = IntervalsQuery.of(_1 -> _1
            .boost(2.0f)
            .field("foo")
            .allOf(b -> b.intervals(Collections.emptyList()))
        );
        assertAncestorCount(1, iq);
        assertEquals(2.0f, iq.boost(), 0.01);
        assertEquals("{\"foo\":{\"boost\":2.0,\"all_of\":{\"intervals\":[]}}}", toJson(iq));
    }

    @Test
    public void testUndefinedCollections() {
        // Not setting a required list should throw an exception
        {
            MissingRequiredPropertyException ex = assertThrows(MissingRequiredPropertyException.class,
                () -> HitsMetadata.of(_1 -> _1.total(_2 -> _2.value(0).relation(TotalHitsRelation.Eq))));
            assertTrue(ex.getMessage().contains(".hits"));
        }

        // Unset list should be non-null, empty but not serialized
        {
            SearchRequest search = SearchRequest.of(b -> b);
            assertNotNull(search.storedFields());
            assertEquals(0, search.storedFields().size());
            assertFalse(ModelTypeHelper.isDefined(search.storedFields()));
            assertEquals("{}", toJson(search));
        }

        // Setting an empty list defines it
        {
            SearchRequest search = SearchRequest.of(b -> b.storedFields(Collections.emptyList()));
            assertNotNull(search.storedFields());
            assertEquals(0, search.storedFields().size());
            assertTrue(ModelTypeHelper.isDefined(search.storedFields()));
            assertEquals("{\"stored_fields\":[]}", toJson(search));
        }

        // Unset map should be non-null, empty but not serialized
        {
            CardinalityAggregate card = CardinalityAggregate.of(b -> b.value(1));
            assertNotNull(card.meta());
            assertEquals(0, card.meta().size());
            assertFalse(ModelTypeHelper.isDefined(card.meta()));
            assertEquals("{\"value\":1}", toJson(card));
        }

        // Setting an empty map defines it
        {
            CardinalityAggregate card = CardinalityAggregate.of(b -> b
                .value(1)
                .meta(Collections.emptyMap())
            );
            assertNotNull(card.meta());
            assertEquals(0, card.meta().size());
            assertTrue(ModelTypeHelper.isDefined(card.meta()));
            assertEquals("{\"meta\":{},\"value\":1}", toJson(card));
        }
    }

    @Test
    public void testDataClassesSingleBuilderUse() {
        // no ancestor + ObjectBuilderBase
        checkSingleBuilderUse(1, new ErrorCause.Builder().type("foo").reason("bar"));

        // 1 ancestor + ObjectBuilderBase
        checkSingleBuilderUse(2, new CardinalityAggregate.Builder().value(0));

        // 3 ancestors + ObjectBuilderBase
        checkSingleBuilderUse(4, new DateRangeAggregate.Builder().buckets(Collections.emptyList()));
    }

    @Test
    public void testUnionSingleBuilderUse() {
        // no ancestor + ObjectBuilderBase
        checkSingleBuilderUse(1, new Aggregate.Builder().cardinality(b -> b.value(0)));

        // 1 ancestor + ObjectBuilderBase
        checkSingleBuilderUse(2, new IntervalsQuery.Builder().field("foo").allOf(b -> b.intervals(Collections.emptyList())));
    }

    private void assertAncestorCount(int count, Object obj) {
        Class<?> clazz = obj.getClass();
        while(count-- >= 0) {
            clazz = clazz.getSuperclass();
        }
        assertEquals(Object.class, clazz);
    }

    private void checkSingleBuilderUse(int count, ObjectBuilder<?> builder) {
        assertAncestorCount(count, builder);

        // Building once should succeed
        builder.build();

        // Building twice should fail
        IllegalStateException ex = assertThrows(IllegalStateException.class, builder::build);
        assertEquals("Object builders can only be used once", ex.getMessage());

        // One more for good measure
        ex = assertThrows(IllegalStateException.class, builder::build);
        assertEquals("Object builders can only be used once", ex.getMessage());
    }
}
