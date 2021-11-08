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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch.core.termvectors.TermVector;
import co.elastic.clients.json.DelegatingDeserializer;
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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.termvectors.Response
@JsonpDeserializable
public class TermvectorsResponse implements JsonpSerializable {
	private final boolean found;

	private final String id;

	private final String index;

	private final Map<String, TermVector> termVectors;

	private final long took;

	@Nullable
	private final String type;

	private final long version;

	// ---------------------------------------------------------------------------------------------

	private TermvectorsResponse(Builder builder) {

		this.found = ModelTypeHelper.requireNonNull(builder.found, this, "found");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.termVectors = ModelTypeHelper.unmodifiable(builder.termVectors);
		this.took = ModelTypeHelper.requireNonNull(builder.took, this, "took");
		this.type = builder.type;
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static TermvectorsResponse of(Function<Builder, ObjectBuilder<TermvectorsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code found}
	 */
	public final boolean found() {
		return this.found;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code term_vectors}
	 */
	public final Map<String, TermVector> termVectors() {
		return this.termVectors;
	}

	/**
	 * Required - API name: {@code took}
	 */
	public final long took() {
		return this.took;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code _version}
	 */
	public final long version() {
		return this.version;
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

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

		if (ModelTypeHelper.isDefined(this.termVectors)) {
			generator.writeKey("term_vectors");
			generator.writeStartObject();
			for (Map.Entry<String, TermVector> item0 : this.termVectors.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("took");
		generator.write(this.took);

		if (this.type != null) {
			generator.writeKey("_type");
			generator.write(this.type);

		}
		generator.writeKey("_version");
		generator.write(this.version);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermvectorsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TermvectorsResponse> {
		private Boolean found;

		private String id;

		private String index;

		@Nullable
		private Map<String, TermVector> termVectors;

		private Long took;

		@Nullable
		private String type;

		private Long version;

		/**
		 * Required - API name: {@code found}
		 */
		public final Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code _index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code term_vectors}
		 */
		public final Builder termVectors(@Nullable Map<String, TermVector> value) {
			this.termVectors = value;
			return this;
		}

		/**
		 * Set {@link #termVectors(Map)} to a singleton map.
		 */
		public Builder termVectors(String key, Function<TermVector.Builder, ObjectBuilder<TermVector>> fn) {
			return this.termVectors(Collections.singletonMap(key, fn.apply(new TermVector.Builder()).build()));
		}

		public final Builder termVectors(
				Function<MapBuilder<String, TermVector, TermVector.Builder>, ObjectBuilder<Map<String, TermVector>>> fn) {
			return termVectors(fn.apply(new MapBuilder<>(TermVector.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code took}
		 */
		public final Builder took(long value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code _type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code _version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link TermvectorsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermvectorsResponse build() {
			_checkSingleUse();

			return new TermvectorsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermvectorsResponse}
	 */
	public static final JsonpDeserializer<TermvectorsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TermvectorsResponse::setupTermvectorsResponseDeserializer, Builder::build);

	protected static void setupTermvectorsResponseDeserializer(DelegatingDeserializer<TermvectorsResponse.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::termVectors, JsonpDeserializer.stringMapDeserializer(TermVector._DESERIALIZER), "term_vectors");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");

	}

}
