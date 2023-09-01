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

import co.elastic.clients.json.ExternallyTaggedUnion;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MultiBucketBase

/**
 * Base type for multi-bucket aggregation results that can hold sub-aggregations
 * results.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MultiBucketBase">API
 *      specification</a>
 */

public abstract class MultiBucketBase implements JsonpSerializable {
	private final Map<String, Aggregate> aggregations;

	private final long docCount;

	// ---------------------------------------------------------------------------------------------

	protected MultiBucketBase(AbstractBuilder<?> builder) {

		this.aggregations = ApiTypeHelper.unmodifiable(builder.aggregations);

		this.docCount = ApiTypeHelper.requireNonNull(builder.docCount, this, "docCount");

	}

	/**
	 * Nested aggregations
	 */
	public final Map<String, Aggregate> aggregations() {
		return this.aggregations;
	}

	/**
	 * Required - API name: {@code doc_count}
	 */
	public final long docCount() {
		return this.docCount;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		ExternallyTaggedUnion.serializeTypedKeysInner(this.aggregations, generator, mapper);

		generator.writeKey("doc_count");
		generator.write(this.docCount);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		protected Map<String, Aggregate> aggregations = new HashMap<>();

		/**
		 * Nested aggregations
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aggregations</code>.
		 */
		public final BuilderT aggregations(Map<String, Aggregate> map) {
			this.aggregations = _mapPutAll(this.aggregations, map);
			return self();
		}

		/**
		 * Nested aggregations
		 * <p>
		 * Adds an entry to <code>aggregations</code>.
		 */
		public final BuilderT aggregations(String key, Aggregate value) {
			this.aggregations = _mapPut(this.aggregations, key, value);
			return self();
		}

		/**
		 * Nested aggregations
		 * <p>
		 * Adds an entry to <code>aggregations</code> using a builder lambda.
		 */
		public final BuilderT aggregations(String key, Function<Aggregate.Builder, ObjectBuilder<Aggregate>> fn) {
			return aggregations(key, fn.apply(new Aggregate.Builder()).build());
		}

		private Long docCount;

		/**
		 * Required - API name: {@code doc_count}
		 */
		public final BuilderT docCount(long value) {
			this.docCount = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupMultiBucketBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::docCount, JsonpDeserializer.longDeserializer(), "doc_count");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			if (builder.aggregations == null) {
				builder.aggregations = new HashMap<>();
			}
			Aggregate._TYPED_KEYS_DESERIALIZER.deserializeEntry(name, parser, mapper, builder.aggregations);
		});

	}

}
