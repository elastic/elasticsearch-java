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
import co.elastic.clients.json.ExternallyTaggedUnion;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MultiBucketBase

public abstract class MultiBucketBase implements JsonpSerializable {
	private final Map<String, Aggregate> aggregations;

	private final long docCount;

	// ---------------------------------------------------------------------------------------------

	protected MultiBucketBase(AbstractBuilder<?> builder) {

		this.aggregations = ModelTypeHelper.unmodifiable(builder.aggregations);

		this.docCount = ModelTypeHelper.requireNonNull(builder.docCount, this, "docCount");

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

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ObjectBuilderBase {
		@Nullable
		protected Map<String, Aggregate> aggregations = new HashMap<>();

		/**
		 * Nested aggregations
		 */
		public final BuilderT aggregations(@Nullable Map<String, Aggregate> value) {
			this.aggregations = value;
			return self();
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public BuilderT aggregations(String key, Function<Aggregate.Builder, ObjectBuilder<Aggregate>> fn) {
			return this.aggregations(Collections.singletonMap(key, fn.apply(new Aggregate.Builder()).build()));
		}

		public final BuilderT aggregations(
				Function<MapBuilder<String, Aggregate, Aggregate.Builder>, ObjectBuilder<Map<String, Aggregate>>> fn) {
			return aggregations(fn.apply(new MapBuilder<>(Aggregate.Builder::new)).build());
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
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::docCount, JsonpDeserializer.longDeserializer(), "doc_count");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			if (builder.aggregations == null) {
				builder.aggregations = new HashMap<>();
			}
			Aggregate._TYPED_KEYS_DESERIALIZER.deserializeEntry(name, parser, mapper, builder.aggregations);
		});

	}

}
