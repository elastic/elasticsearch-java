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

package co.elastic.clients.elasticsearch._core.search;

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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.FieldCollapse
@JsonpDeserializable
public final class FieldCollapse implements JsonpSerializable {
	private final String field;

	@Nullable
	private final List<InnerHits> innerHits;

	@Nullable
	private final Integer maxConcurrentGroupSearches;

	// ---------------------------------------------------------------------------------------------

	public FieldCollapse(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.innerHits = builder.innerHits;
		this.maxConcurrentGroupSearches = builder.maxConcurrentGroupSearches;

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code inner_hits}
	 */
	@Nullable
	public List<InnerHits> innerHits() {
		return this.innerHits;
	}

	/**
	 * API name: {@code max_concurrent_group_searches}
	 */
	@Nullable
	public Integer maxConcurrentGroupSearches() {
		return this.maxConcurrentGroupSearches;
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

		generator.writeKey("field");
		generator.write(this.field);

		if (this.innerHits != null) {

			generator.writeKey("inner_hits");
			generator.writeStartArray();
			for (InnerHits item0 : this.innerHits) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.maxConcurrentGroupSearches != null) {

			generator.writeKey("max_concurrent_group_searches");
			generator.write(this.maxConcurrentGroupSearches);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCollapse}.
	 */
	public static class Builder implements ObjectBuilder<FieldCollapse> {
		private String field;

		@Nullable
		private List<InnerHits> innerHits;

		@Nullable
		private Integer maxConcurrentGroupSearches;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code inner_hits}
		 */
		public Builder innerHits(@Nullable List<InnerHits> value) {
			this.innerHits = value;
			return this;
		}

		/**
		 * API name: {@code inner_hits}
		 */
		public Builder innerHits(InnerHits... value) {
			this.innerHits = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #innerHits(List)}, creating the list if needed.
		 */
		public Builder addInnerHits(InnerHits value) {
			if (this.innerHits == null) {
				this.innerHits = new ArrayList<>();
			}
			this.innerHits.add(value);
			return this;
		}

		/**
		 * Set {@link #innerHits(List)} to a singleton list.
		 */
		public Builder innerHits(Function<InnerHits.Builder, ObjectBuilder<InnerHits>> fn) {
			return this.innerHits(fn.apply(new InnerHits.Builder()).build());
		}

		/**
		 * Add a value to {@link #innerHits(List)}, creating the list if needed.
		 */
		public Builder addInnerHits(Function<InnerHits.Builder, ObjectBuilder<InnerHits>> fn) {
			return this.addInnerHits(fn.apply(new InnerHits.Builder()).build());
		}

		/**
		 * API name: {@code max_concurrent_group_searches}
		 */
		public Builder maxConcurrentGroupSearches(@Nullable Integer value) {
			this.maxConcurrentGroupSearches = value;
			return this;
		}

		/**
		 * Builds a {@link FieldCollapse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldCollapse build() {

			return new FieldCollapse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldCollapse}
	 */
	public static final JsonpDeserializer<FieldCollapse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldCollapse::setupFieldCollapseDeserializer, Builder::build);

	protected static void setupFieldCollapseDeserializer(DelegatingDeserializer<FieldCollapse.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::innerHits, JsonpDeserializer.arrayDeserializer(InnerHits._DESERIALIZER), "inner_hits");
		op.add(Builder::maxConcurrentGroupSearches, JsonpDeserializer.integerDeserializer(),
				"max_concurrent_group_searches");

	}

}
