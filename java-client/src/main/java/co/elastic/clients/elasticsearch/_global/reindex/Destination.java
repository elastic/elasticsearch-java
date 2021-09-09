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

package co.elastic.clients.elasticsearch._global.reindex;

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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.reindex.Destination
public final class Destination implements ToJsonp {
	private final String index;

	@Nullable
	private final JsonValue opType;

	@Nullable
	private final String pipeline;

	@Nullable
	private final String routing;

	@Nullable
	private final JsonValue versionType;

	// ---------------------------------------------------------------------------------------------

	protected Destination(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.opType = builder.opType;
		this.pipeline = builder.pipeline;
		this.routing = builder.routing;
		this.versionType = builder.versionType;

	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code op_type}
	 */
	@Nullable
	public JsonValue opType() {
		return this.opType;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public String pipeline() {
		return this.pipeline;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
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

		generator.writeKey("index");
		generator.write(this.index);

		if (this.opType != null) {

			generator.writeKey("op_type");
			generator.write(this.opType);

		}
		if (this.pipeline != null) {

			generator.writeKey("pipeline");
			generator.write(this.pipeline);

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.versionType != null) {

			generator.writeKey("version_type");
			generator.write(this.versionType);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Destination}.
	 */
	public static class Builder implements ObjectBuilder<Destination> {
		private String index;

		@Nullable
		private JsonValue opType;

		@Nullable
		private String pipeline;

		@Nullable
		private String routing;

		@Nullable
		private JsonValue versionType;

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code op_type}
		 */
		public Builder opType(@Nullable JsonValue value) {
			this.opType = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public Builder pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
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
		 * Builds a {@link Destination}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Destination build() {

			return new Destination(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Destination
	 */
	public static final JsonpDeserializer<Destination> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Destination::setupDestinationDeserializer);

	protected static void setupDestinationDeserializer(DelegatingDeserializer<Destination.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::opType, JsonpDeserializer.jsonValueDeserializer(), "op_type");
		op.add(Builder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::versionType, JsonpDeserializer.jsonValueDeserializer(), "version_type");

	}

}
