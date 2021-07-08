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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.elasticsearch._global.termvectors.TermVector;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.termvectors.Response
public final class TermvectorsResponse implements ToJsonp {
	private final Boolean found;

	private final String _id;

	private final String _index;

	@Nullable
	private final Map<String, TermVector> termVectors;

	private final Number took;

	@Nullable
	private final String _type;

	private final Number _version;

	// ---------------------------------------------------------------------------------------------

	protected TermvectorsResponse(Builder builder) {

		this.found = Objects.requireNonNull(builder.found, "found");
		this._id = Objects.requireNonNull(builder._id, "_id");
		this._index = Objects.requireNonNull(builder._index, "_index");
		this.termVectors = builder.termVectors;
		this.took = Objects.requireNonNull(builder.took, "took");
		this._type = builder._type;
		this._version = Objects.requireNonNull(builder._version, "_version");

	}

	/**
	 * API name: {@code found}
	 */
	public Boolean found() {
		return this.found;
	}

	/**
	 * API name: {@code _id}
	 */
	public String _id() {
		return this._id;
	}

	/**
	 * API name: {@code _index}
	 */
	public String _index() {
		return this._index;
	}

	/**
	 * API name: {@code term_vectors}
	 */
	@Nullable
	public Map<String, TermVector> termVectors() {
		return this.termVectors;
	}

	/**
	 * API name: {@code took}
	 */
	public Number took() {
		return this.took;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String _type() {
		return this._type;
	}

	/**
	 * API name: {@code _version}
	 */
	public Number _version() {
		return this._version;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("_id");
		generator.write(this._id);

		generator.writeKey("_index");
		generator.write(this._index);

		if (this.termVectors != null) {

			generator.writeKey("term_vectors");
			generator.writeStartObject();
			for (Map.Entry<String, TermVector> item0 : this.termVectors.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("took");
		generator.write(this.took.doubleValue());

		if (this._type != null) {

			generator.writeKey("_type");
			generator.write(this._type);

		}

		generator.writeKey("_version");
		generator.write(this._version.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermvectorsResponse}.
	 */
	public static class Builder implements ObjectBuilder<TermvectorsResponse> {
		private Boolean found;

		private String _id;

		private String _index;

		@Nullable
		private Map<String, TermVector> termVectors;

		private Number took;

		@Nullable
		private String _type;

		private Number _version;

		/**
		 * API name: {@code found}
		 */
		public Builder found(Boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * API name: {@code _id}
		 */
		public Builder _id(String value) {
			this._id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder _index(String value) {
			this._index = value;
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
		 * API name: {@code took}
		 */
		public Builder took(Number value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code _type}
		 */
		public Builder _type(@Nullable String value) {
			this._type = value;
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public Builder _version(Number value) {
			this._version = value;
			return this;
		}

		/**
		 * Builds a {@link TermvectorsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermvectorsResponse build() {

			return new TermvectorsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TermvectorsResponse
	 */
	public static final JsonpDeserializer<TermvectorsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TermvectorsResponse::setupTermvectorsResponseDeserializer);

	protected static void setupTermvectorsResponseDeserializer(DelegatingDeserializer<TermvectorsResponse.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::_index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::termVectors, JsonpDeserializer.stringMapDeserializer(TermVector.DESERIALIZER), "term_vectors");
		op.add(Builder::took, JsonpDeserializer.numberDeserializer(), "took");
		op.add(Builder::_type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::_version, JsonpDeserializer.numberDeserializer(), "_version");

	}

}
