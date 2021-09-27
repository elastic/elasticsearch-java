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
import co.elastic.clients.util.ObjectBuilder;
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
public final class VertexDefinition implements JsonpSerializable {
	@Nullable
	private final List<String> exclude;

	private final String field;

	@Nullable
	private final List<VertexInclude> include;

	@Nullable
	private final Long minDocCount;

	@Nullable
	private final Long shardMinDocCount;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	public VertexDefinition(Builder builder) {

		this.exclude = builder.exclude;
		this.field = Objects.requireNonNull(builder.field, "field");
		this.include = builder.include;
		this.minDocCount = builder.minDocCount;
		this.shardMinDocCount = builder.shardMinDocCount;
		this.size = builder.size;

	}

	/**
	 * API name: {@code exclude}
	 */
	@Nullable
	public List<String> exclude() {
		return this.exclude;
	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code include}
	 */
	@Nullable
	public List<VertexInclude> include() {
		return this.include;
	}

	/**
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public Long minDocCount() {
		return this.minDocCount;
	}

	/**
	 * API name: {@code shard_min_doc_count}
	 */
	@Nullable
	public Long shardMinDocCount() {
		return this.shardMinDocCount;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
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

		if (this.exclude != null) {

			generator.writeKey("exclude");
			generator.writeStartArray();
			for (String item0 : this.exclude) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("field");
		generator.write(this.field);

		if (this.include != null) {

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
	public static class Builder implements ObjectBuilder<VertexDefinition> {
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
		public Builder exclude(@Nullable List<String> value) {
			this.exclude = value;
			return this;
		}

		/**
		 * API name: {@code exclude}
		 */
		public Builder exclude(String... value) {
			this.exclude = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #exclude(List)}, creating the list if needed.
		 */
		public Builder addExclude(String value) {
			if (this.exclude == null) {
				this.exclude = new ArrayList<>();
			}
			this.exclude.add(value);
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public Builder include(@Nullable List<VertexInclude> value) {
			this.include = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public Builder include(VertexInclude... value) {
			this.include = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #include(List)}, creating the list if needed.
		 */
		public Builder addInclude(VertexInclude value) {
			if (this.include == null) {
				this.include = new ArrayList<>();
			}
			this.include.add(value);
			return this;
		}

		/**
		 * Set {@link #include(List)} to a singleton list.
		 */
		public Builder include(Function<VertexInclude.Builder, ObjectBuilder<VertexInclude>> fn) {
			return this.include(fn.apply(new VertexInclude.Builder()).build());
		}

		/**
		 * Add a value to {@link #include(List)}, creating the list if needed.
		 */
		public Builder addInclude(Function<VertexInclude.Builder, ObjectBuilder<VertexInclude>> fn) {
			return this.addInclude(fn.apply(new VertexInclude.Builder()).build());
		}

		/**
		 * API name: {@code min_doc_count}
		 */
		public Builder minDocCount(@Nullable Long value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * API name: {@code shard_min_doc_count}
		 */
		public Builder shardMinDocCount(@Nullable Long value) {
			this.shardMinDocCount = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
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
