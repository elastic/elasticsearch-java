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

package co.elastic.clients.elasticsearch._core.mtermvectors;

import co.elastic.clients.elasticsearch._core.termvectors.TermVector;
import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.mtermvectors.TermVectorsResult
@JsonpDeserializable
public final class TermVectorsResult implements JsonpSerializable {
	private final String id;

	private final String index;

	@Nullable
	private final Long version;

	@Nullable
	private final Long took;

	@Nullable
	private final Boolean found;

	@Nullable
	private final Map<String, TermVector> termVectors;

	@Nullable
	private final ErrorCause error;

	// ---------------------------------------------------------------------------------------------

	public TermVectorsResult(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "_id");
		this.index = Objects.requireNonNull(builder.index, "_index");
		this.version = builder.version;
		this.took = builder.took;
		this.found = builder.found;
		this.termVectors = ModelTypeHelper.unmodifiable(builder.termVectors);
		this.error = builder.error;

	}

	public TermVectorsResult(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code _index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code _version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * API name: {@code took}
	 */
	@Nullable
	public Long took() {
		return this.took;
	}

	/**
	 * API name: {@code found}
	 */
	@Nullable
	public Boolean found() {
		return this.found;
	}

	/**
	 * API name: {@code term_vectors}
	 */
	@Nullable
	public Map<String, TermVector> termVectors() {
		return this.termVectors;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public ErrorCause error() {
		return this.error;
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

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

		if (this.version != null) {

			generator.writeKey("_version");
			generator.write(this.version);

		}
		if (this.took != null) {

			generator.writeKey("took");
			generator.write(this.took);

		}
		if (this.found != null) {

			generator.writeKey("found");
			generator.write(this.found);

		}
		if (this.termVectors != null) {

			generator.writeKey("term_vectors");
			generator.writeStartObject();
			for (Map.Entry<String, TermVector> item0 : this.termVectors.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.error != null) {

			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermVectorsResult}.
	 */
	public static class Builder implements ObjectBuilder<TermVectorsResult> {
		private String id;

		private String index;

		@Nullable
		private Long version;

		@Nullable
		private Long took;

		@Nullable
		private Boolean found;

		@Nullable
		private Map<String, TermVector> termVectors;

		@Nullable
		private ErrorCause error;

		/**
		 * API name: {@code _id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code took}
		 */
		public Builder took(@Nullable Long value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code found}
		 */
		public Builder found(@Nullable Boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * API name: {@code term_vectors}
		 */
		public Builder termVectors(@Nullable Map<String, TermVector> value) {
			this.termVectors = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #termVectors(Map)}, creating the map if needed.
		 */
		public Builder putTermVectors(String key, TermVector value) {
			if (this.termVectors == null) {
				this.termVectors = new HashMap<>();
			}
			this.termVectors.put(key, value);
			return this;
		}

		/**
		 * Set {@link #termVectors(Map)} to a singleton map.
		 */
		public Builder termVectors(String key, Function<TermVector.Builder, ObjectBuilder<TermVector>> fn) {
			return this.termVectors(Collections.singletonMap(key, fn.apply(new TermVector.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #termVectors(Map)}, creating the map if needed.
		 */
		public Builder putTermVectors(String key, Function<TermVector.Builder, ObjectBuilder<TermVector>> fn) {
			return this.putTermVectors(key, fn.apply(new TermVector.Builder()).build());
		}

		/**
		 * API name: {@code error}
		 */
		public Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Builds a {@link TermVectorsResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermVectorsResult build() {

			return new TermVectorsResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermVectorsResult}
	 */
	public static final JsonpDeserializer<TermVectorsResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TermVectorsResult::setupTermVectorsResultDeserializer, Builder::build);

	protected static void setupTermVectorsResultDeserializer(DelegatingDeserializer<TermVectorsResult.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::termVectors, JsonpDeserializer.stringMapDeserializer(TermVector._DESERIALIZER), "term_vectors");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");

	}

}
