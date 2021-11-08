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

package co.elastic.clients.elasticsearch.core.mtermvectors;

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

// typedef: _global.mtermvectors.TermVectorsResult
@JsonpDeserializable
public class TermVectorsResult implements JsonpSerializable {
	private final boolean found;

	private final String id;

	private final String index;

	private final Map<String, TermVector> termVectors;

	private final long took;

	private final long version;

	// ---------------------------------------------------------------------------------------------

	private TermVectorsResult(Builder builder) {

		this.found = ModelTypeHelper.requireNonNull(builder.found, this, "found");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.termVectors = ModelTypeHelper.unmodifiableRequired(builder.termVectors, this, "termVectors");
		this.took = ModelTypeHelper.requireNonNull(builder.took, this, "took");
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static TermVectorsResult of(Function<Builder, ObjectBuilder<TermVectorsResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code found}
	 */
	public final boolean found() {
		return this.found;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code term_vectors}
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
	 * Required - API name: {@code version}
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("index");
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

		generator.writeKey("version");
		generator.write(this.version);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermVectorsResult}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TermVectorsResult> {
		private Boolean found;

		private String id;

		private String index;

		private Map<String, TermVector> termVectors;

		private Long took;

		private Long version;

		/**
		 * Required - API name: {@code found}
		 */
		public final Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code term_vectors}
		 */
		public final Builder termVectors(Map<String, TermVector> value) {
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
		 * Required - API name: {@code version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link TermVectorsResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermVectorsResult build() {
			_checkSingleUse();

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

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::termVectors, JsonpDeserializer.stringMapDeserializer(TermVector._DESERIALIZER), "term_vectors");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

}
