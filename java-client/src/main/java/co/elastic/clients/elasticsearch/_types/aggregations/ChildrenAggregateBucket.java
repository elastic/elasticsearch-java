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
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.ChildrenAggregateBucket

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/aggregations/Aggregate.ts#L718-L718">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChildrenAggregateBucket extends MultiBucketBase {
	// ---------------------------------------------------------------------------------------------

	private ChildrenAggregateBucket(Builder builder) {
		super(builder);

	}

	public static ChildrenAggregateBucket of(Function<Builder, ObjectBuilder<ChildrenAggregateBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChildrenAggregateBucket}.
	 */

	public static class Builder extends MultiBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ChildrenAggregateBucket> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ChildrenAggregateBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChildrenAggregateBucket build() {
			_checkSingleUse();

			return new ChildrenAggregateBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ChildrenAggregateBucket}
	 */
	public static final JsonpDeserializer<ChildrenAggregateBucket> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ChildrenAggregateBucket::setupChildrenAggregateBucketDeserializer);

	protected static void setupChildrenAggregateBucketDeserializer(
			ObjectDeserializer<ChildrenAggregateBucket.Builder> op) {
		MultiBucketBase.setupMultiBucketBaseDeserializer(op);

	}

}
