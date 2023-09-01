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
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.FrequentItemSetsBucket

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.FrequentItemSetsBucket">API
 *      specification</a>
 */
@JsonpDeserializable
public class FrequentItemSetsBucket extends MultiBucketBase {
	private final Map<String, List<String>> key;

	private final double support;

	// ---------------------------------------------------------------------------------------------

	private FrequentItemSetsBucket(Builder builder) {
		super(builder);

		this.key = ApiTypeHelper.unmodifiableRequired(builder.key, this, "key");
		this.support = ApiTypeHelper.requireNonNull(builder.support, this, "support");

	}

	public static FrequentItemSetsBucket of(Function<Builder, ObjectBuilder<FrequentItemSetsBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final Map<String, List<String>> key() {
		return this.key;
	}

	/**
	 * Required - API name: {@code support}
	 */
	public final double support() {
		return this.support;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.key)) {
			generator.writeKey("key");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.key.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		generator.writeKey("support");
		generator.write(this.support);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FrequentItemSetsBucket}.
	 */

	public static class Builder extends MultiBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FrequentItemSetsBucket> {
		private Map<String, List<String>> key;

		private Double support;

		/**
		 * Required - API name: {@code key}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>key</code>.
		 */
		public final Builder key(Map<String, List<String>> map) {
			this.key = _mapPutAll(this.key, map);
			return this;
		}

		/**
		 * Required - API name: {@code key}
		 * <p>
		 * Adds an entry to <code>key</code>.
		 */
		public final Builder key(String key, List<String> value) {
			this.key = _mapPut(this.key, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code support}
		 */
		public final Builder support(double value) {
			this.support = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FrequentItemSetsBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FrequentItemSetsBucket build() {
			_checkSingleUse();

			return new FrequentItemSetsBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FrequentItemSetsBucket}
	 */
	public static final JsonpDeserializer<FrequentItemSetsBucket> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FrequentItemSetsBucket::setupFrequentItemSetsBucketDeserializer);

	protected static void setupFrequentItemSetsBucketDeserializer(
			ObjectDeserializer<FrequentItemSetsBucket.Builder> op) {
		MultiBucketBase.setupMultiBucketBaseDeserializer(op);
		op.add(Builder::key, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "key");
		op.add(Builder::support, JsonpDeserializer.doubleDeserializer(), "support");

	}

}
