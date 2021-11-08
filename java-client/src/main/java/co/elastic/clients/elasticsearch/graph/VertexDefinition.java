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

package co.elastic.clients.elasticsearch.graph;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: graph._types.VertexDefinition
@JsonpDeserializable
public class VertexDefinition implements JsonpSerializable {
	private final List<String> exclude;

	private final String field;

	private final List<VertexInclude> include;

	@Nullable
	private final Long minDocCount;

	@Nullable
	private final Long shardMinDocCount;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private VertexDefinition(Builder builder) {

		this.exclude = ModelTypeHelper.unmodifiable(builder.exclude);
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.include = ModelTypeHelper.unmodifiable(builder.include);
		this.minDocCount = builder.minDocCount;
		this.shardMinDocCount = builder.shardMinDocCount;
		this.size = builder.size;

	}

	public static VertexDefinition of(Function<Builder, ObjectBuilder<VertexDefinition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code exclude}
	 */
	public final List<String> exclude() {
		return this.exclude;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code include}
	 */
	public final List<VertexInclude> include() {
		return this.include;
	}

	/**
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public final Long minDocCount() {
		return this.minDocCount;
	}

	/**
	 * API name: {@code shard_min_doc_count}
	 */
	@Nullable
	public final Long shardMinDocCount() {
		return this.shardMinDocCount;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
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

		if (ModelTypeHelper.isDefined(this.exclude)) {
			generator.writeKey("exclude");
			generator.writeStartArray();
			for (String item0 : this.exclude) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("field");
		generator.write(this.field);

		if (ModelTypeHelper.isDefined(this.include)) {
			generator.writeKey("include");
			generator.writeStartArray();
			for (VertexInclude item0 : this.include) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.minDocCount != null) {
			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount);

		}
		if (this.shardMinDocCount != null) {
			generator.writeKey("shard_min_doc_count");
			generator.write(this.shardMinDocCount);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VertexDefinition}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<VertexDefinition> {
		@Nullable
		private List<String> exclude;

		private String field;

		@Nullable
		private List<VertexInclude> include;

		@Nullable
		private Long minDocCount;

		@Nullable
		private Long shardMinDocCount;

		@Nullable
		private Integer size;

		/**
		 * API name: {@code exclude}
		 */
		public final Builder exclude(@Nullable List<String> value) {
			this.exclude = value;
			return this;
		}

		/**
		 * API name: {@code exclude}
		 */
		public final Builder exclude(String... value) {
			this.exclude = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public final Builder include(@Nullable List<VertexInclude> value) {
			this.include = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public final Builder include(VertexInclude... value) {
			this.include = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		@SafeVarargs
		public final Builder include(Function<VertexInclude.Builder, ObjectBuilder<VertexInclude>>... fns) {
			this.include = new ArrayList<>(fns.length);
			for (Function<VertexInclude.Builder, ObjectBuilder<VertexInclude>> fn : fns) {
				this.include.add(fn.apply(new VertexInclude.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code min_doc_count}
		 */
		public final Builder minDocCount(@Nullable Long value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * API name: {@code shard_min_doc_count}
		 */
		public final Builder shardMinDocCount(@Nullable Long value) {
			this.shardMinDocCount = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link VertexDefinition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VertexDefinition build() {
			_checkSingleUse();

			return new VertexDefinition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VertexDefinition}
	 */
	public static final JsonpDeserializer<VertexDefinition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			VertexDefinition::setupVertexDefinitionDeserializer, Builder::build);

	protected static void setupVertexDefinitionDeserializer(DelegatingDeserializer<VertexDefinition.Builder> op) {

		op.add(Builder::exclude, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"exclude");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::include, JsonpDeserializer.arrayDeserializer(VertexInclude._DESERIALIZER), "include");
		op.add(Builder::minDocCount, JsonpDeserializer.longDeserializer(), "min_doc_count");
		op.add(Builder::shardMinDocCount, JsonpDeserializer.longDeserializer(), "shard_min_doc_count");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");

	}

}
