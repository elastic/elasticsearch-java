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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;

// typedef: _types.aggregations.BucketAggregationBase

/**
 * Base type for bucket aggregations. These aggregations also accept
 * sub-aggregations.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.BucketAggregationBase">API
 *      specification</a>
 */

public abstract class BucketAggregationBase extends AggregationBase {
	// ---------------------------------------------------------------------------------------------

	protected BucketAggregationBase(AbstractBuilder<?> builder) {
		super(builder);

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AggregationBase.AbstractBuilder<BuilderT> {
	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupBucketAggregationBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		AggregationBase.setupAggregationBaseDeserializer(op);

	}

}
