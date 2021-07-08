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

package co.elastic.clients.elasticsearch._global.mget;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.mget.Operation
public final class Operation implements ToJsonp {
	private final JsonValue _id;

	@Nullable
	private final String _index;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final JsonValue _source;

	@Nullable
	private final List<String> storedFields;

	@Nullable
	private final String _type;

	@Nullable
	private final Number version;

	@Nullable
	private final JsonValue versionType;

	// ---------------------------------------------------------------------------------------------

	protected Operation(Builder builder) {

		this._id = Objects.requireNonNull(builder._id, "_id");
		this._index = builder._index;
		this.routing = builder.routing;
		this._source = builder._source;
		this.storedFields = builder.storedFields;
		this._type = builder._type;
		this.version = builder.version;
		this.versionType = builder.versionType;

	}

	/**
	 * API name: {@code _id}
	 */
	public JsonValue _id() {
		return this._id;
	}

	/**
	 * API name: {@code _index}
	 */
	@Nullable
	public String _index() {
		return this._index;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue _source() {
		return this._source;
	}

	/**
	 * API name: {@code stored_fields}
	 */
	@Nullable
	public List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String _type() {
		return this._type;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code version_type}
	 */
	@Nullable
	public JsonValue versionType() {
		return this.versionType;
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

		if (this._index != null) {

			generator.writeKey("_index");
			generator.write(this._index);

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this._source != null) {

			generator.writeKey("_source");
			generator.write(this._source);

		}
		if (this.storedFields != null) {

			generator.writeKey("stored_fields");
			generator.writeStartArray();
			for (String item0 : this.storedFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this._type != null) {

			generator.writeKey("_type");
			generator.write(this._type);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}
		if (this.versionType != null) {

			generator.writeKey("version_type");
			generator.write(this.versionType);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Operation}.
	 */
	public static class Builder implements ObjectBuilder<Operation> {
		private JsonValue _id;

		@Nullable
		private String _index;

		@Nullable
		private JsonValue routing;

		@Nullable
		private JsonValue _source;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private String _type;

		@Nullable
		private Number version;

		@Nullable
		private JsonValue versionType;

		/**
		 * API name: {@code _id}
		 */
		public Builder _id(JsonValue value) {
			this._id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder _index(@Nullable String value) {
			this._index = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder _source(@Nullable JsonValue value) {
			this._source = value;
			return this;
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #storedFields(List)}, creating the list if needed.
		 */
		public Builder addStoredFields(String value) {
			if (this.storedFields == null) {
				this.storedFields = new ArrayList<>();
			}
			this.storedFields.add(value);
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
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version_type}
		 */
		public Builder versionType(@Nullable JsonValue value) {
			this.versionType = value;
			return this;
		}

		/**
		 * Builds a {@link Operation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Operation build() {

			return new Operation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Operation
	 */
	public static final JsonpDeserializer<Operation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Operation::setupOperationDeserializer);

	protected static void setupOperationDeserializer(DelegatingDeserializer<Operation.Builder> op) {

		op.add(Builder::_id, JsonpDeserializer.jsonValueDeserializer(), "_id");
		op.add(Builder::_index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::routing, JsonpDeserializer.jsonValueDeserializer(), "routing");
		op.add(Builder::_source, JsonpDeserializer.jsonValueDeserializer(), "_source");
		op.add(Builder::storedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_fields");
		op.add(Builder::_type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");
		op.add(Builder::versionType, JsonpDeserializer.jsonValueDeserializer(), "version_type");

	}

}
