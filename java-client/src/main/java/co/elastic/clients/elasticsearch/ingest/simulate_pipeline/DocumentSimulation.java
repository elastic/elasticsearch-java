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

package co.elastic.clients.elasticsearch.ingest.simulate_pipeline;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.simulate_pipeline.DocumentSimulation
public final class DocumentSimulation implements ToJsonp {
	private final String _id;

	private final String _index;

	private final Ingest _ingest;

	@Nullable
	private final String _parent;

	@Nullable
	private final String _routing;

	private final Map<String, JsonValue> _source;

	@Nullable
	private final String _type;

	// ---------------------------------------------------------------------------------------------

	protected DocumentSimulation(Builder builder) {

		this._id = Objects.requireNonNull(builder._id, "_id");
		this._index = Objects.requireNonNull(builder._index, "_index");
		this._ingest = Objects.requireNonNull(builder._ingest, "_ingest");
		this._parent = builder._parent;
		this._routing = builder._routing;
		this._source = Objects.requireNonNull(builder._source, "_source");
		this._type = builder._type;

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
	 * API name: {@code _ingest}
	 */
	public Ingest _ingest() {
		return this._ingest;
	}

	/**
	 * API name: {@code _parent}
	 */
	@Nullable
	public String _parent() {
		return this._parent;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public String _routing() {
		return this._routing;
	}

	/**
	 * API name: {@code _source}
	 */
	public Map<String, JsonValue> _source() {
		return this._source;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String _type() {
		return this._type;
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

		generator.writeKey("_id");
		generator.write(this._id);

		generator.writeKey("_index");
		generator.write(this._index);

		generator.writeKey("_ingest");
		this._ingest.toJsonp(generator, mapper);

		if (this._parent != null) {

			generator.writeKey("_parent");
			generator.write(this._parent);

		}
		if (this._routing != null) {

			generator.writeKey("_routing");
			generator.write(this._routing);

		}

		generator.writeKey("_source");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this._source.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		if (this._type != null) {

			generator.writeKey("_type");
			generator.write(this._type);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DocumentSimulation}.
	 */
	public static class Builder implements ObjectBuilder<DocumentSimulation> {
		private String _id;

		private String _index;

		private Ingest _ingest;

		@Nullable
		private String _parent;

		@Nullable
		private String _routing;

		private Map<String, JsonValue> _source;

		@Nullable
		private String _type;

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
		 * API name: {@code _ingest}
		 */
		public Builder _ingest(Ingest value) {
			this._ingest = value;
			return this;
		}

		/**
		 * API name: {@code _ingest}
		 */
		public Builder _ingest(Function<Ingest.Builder, ObjectBuilder<Ingest>> fn) {
			return this._ingest(fn.apply(new Ingest.Builder()).build());
		}

		/**
		 * API name: {@code _parent}
		 */
		public Builder _parent(@Nullable String value) {
			this._parent = value;
			return this;
		}

		/**
		 * API name: {@code _routing}
		 */
		public Builder _routing(@Nullable String value) {
			this._routing = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder _source(Map<String, JsonValue> value) {
			this._source = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #_source(Map)}, creating the map if needed.
		 */
		public Builder put_source(String key, JsonValue value) {
			if (this._source == null) {
				this._source = new HashMap<>();
			}
			this._source.put(key, value);
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
		 * Builds a {@link DocumentSimulation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DocumentSimulation build() {

			return new DocumentSimulation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DocumentSimulation
	 */
	public static final JsonpDeserializer<DocumentSimulation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DocumentSimulation::setupDocumentSimulationDeserializer);

	protected static void setupDocumentSimulationDeserializer(DelegatingDeserializer<DocumentSimulation.Builder> op) {

		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::_index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::_ingest, Ingest.DESERIALIZER, "_ingest");
		op.add(Builder::_parent, JsonpDeserializer.stringDeserializer(), "_parent");
		op.add(Builder::_routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(Builder::_source, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"_source");
		op.add(Builder::_type, JsonpDeserializer.stringDeserializer(), "_type");

	}

}
