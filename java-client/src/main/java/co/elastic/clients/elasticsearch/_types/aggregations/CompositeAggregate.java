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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch.security.query_api_keys.ApiKeyAggregate;
import co.elastic.clients.elasticsearch.security.query_api_keys.ApiKeyAggregateVariant;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.aggregations.CompositeAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CompositeAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompositeAggregate extends MultiBucketAggregateBase<CompositeBucket>
		implements
			AggregateVariant,
			ApiKeyAggregateVariant {
	private final Map<String, FieldValue> afterKey;

	// ---------------------------------------------------------------------------------------------

	private CompositeAggregate(Builder builder) {
		super(builder);

		this.afterKey = ApiTypeHelper.unmodifiable(builder.afterKey);

	}

	public static CompositeAggregate of(Function<Builder, ObjectBuilder<CompositeAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.Composite;
	}

	/**
	 * ApiKeyAggregate variant kind.
	 */
	@Override
	public ApiKeyAggregate.Kind _apiKeyAggregateKind() {
		return ApiKeyAggregate.Kind.Composite;
	}

	/**
	 * API name: {@code after_key}
	 */
	public final Map<String, FieldValue> afterKey() {
		return this.afterKey;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.afterKey)) {
			generator.writeKey("after_key");
			generator.writeStartObject();
			for (Map.Entry<String, FieldValue> item0 : this.afterKey.entrySet()) {
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
		private Map<String, FieldValue> afterKey;

		/**
		 * API name: {@code after_key}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>afterKey</code>.
		 */
		public final Builder afterKey(Map<String, FieldValue> map) {
			this.afterKey = _mapPutAll(this.afterKey, map);
			return this;
		}

		/**
		 * API name: {@code after_key}
		 * <p>
		 * Adds an entry to <code>afterKey</code>.
		 */
		public final Builder afterKey(String key, FieldValue value) {
			this.afterKey = _mapPut(this.afterKey, key, value);
			return this;
		}

		/**
		 * API name: {@code after_key}
		 * <p>
		 * Adds an entry to <code>afterKey</code> using a builder lambda.
		 */
		public final Builder afterKey(String key, Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return afterKey(key, fn.apply(new FieldValue.Builder()).build());
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
			.lazy(Builder::new, CompositeAggregate::setupCompositeAggregateDeserializer);

	protected static void setupCompositeAggregateDeserializer(ObjectDeserializer<CompositeAggregate.Builder> op) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op, CompositeBucket._DESERIALIZER);
		op.add(Builder::afterKey, JsonpDeserializer.stringMapDeserializer(FieldValue._DESERIALIZER), "after_key");

	}

}
