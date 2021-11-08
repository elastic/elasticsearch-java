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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CompositeAggregate
@JsonpDeserializable
public class CompositeAggregate extends MultiBucketAggregateBase<CompositeBucket> implements AggregateVariant {
	private final Map<String, JsonData> afterKey;

	// ---------------------------------------------------------------------------------------------

	private CompositeAggregate(Builder builder) {
		super(builder);

		this.afterKey = ModelTypeHelper.unmodifiable(builder.afterKey);

	}

	public static CompositeAggregate of(Function<Builder, ObjectBuilder<CompositeAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "composite";
	}

	/**
	 * API name: {@code after_key}
	 */
	public final Map<String, JsonData> afterKey() {
		return this.afterKey;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.afterKey)) {
			generator.writeKey("after_key");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.afterKey.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompositeAggregate}.
	 */
	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<CompositeBucket, Builder>
			implements
				ObjectBuilder<CompositeAggregate> {
		@Nullable
		private Map<String, JsonData> afterKey;

		/**
		 * API name: {@code after_key}
		 */
		public final Builder afterKey(@Nullable Map<String, JsonData> value) {
			this.afterKey = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompositeAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompositeAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new CompositeAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompositeAggregate}
	 */
	public static final JsonpDeserializer<CompositeAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompositeAggregate::setupCompositeAggregateDeserializer, Builder::build);

	protected static void setupCompositeAggregateDeserializer(DelegatingDeserializer<CompositeAggregate.Builder> op) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op, CompositeBucket._DESERIALIZER);
		op.add(Builder::afterKey, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "after_key");

	}

}
