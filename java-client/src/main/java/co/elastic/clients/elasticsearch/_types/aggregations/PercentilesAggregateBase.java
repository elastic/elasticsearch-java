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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.PercentilesAggregateBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.PercentilesAggregateBase">API
 *      specification</a>
 */

public abstract class PercentilesAggregateBase extends AggregateBase {
	private final Percentiles values;

	// ---------------------------------------------------------------------------------------------

	protected PercentilesAggregateBase(AbstractBuilder<?> builder) {
		super(builder);

		this.values = ApiTypeHelper.requireNonNull(builder.values, this, "values");

	}

	/**
	 * Required - API name: {@code values}
	 */
	public final Percentiles values() {
		return this.values;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("values");
		this.values.serialize(generator, mapper);

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AggregateBase.AbstractBuilder<BuilderT> {
		private Percentiles values;

		/**
		 * Required - API name: {@code values}
		 */
		public final BuilderT values(Percentiles value) {
			this.values = value;
			return self();
		}

		/**
		 * Required - API name: {@code values}
		 */
		public final BuilderT values(Function<Percentiles.Builder, ObjectBuilder<Percentiles>> fn) {
			return this.values(fn.apply(new Percentiles.Builder()).build());
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupPercentilesAggregateBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(AbstractBuilder::values, Percentiles._DESERIALIZER, "values");

	}

}
