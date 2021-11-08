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

package co.elastic.clients.elasticsearch.security;

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
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.has_privileges.Response
@JsonpDeserializable
public class HasPrivilegesResponse implements JsonpSerializable {
	private final Map<String, Map<String, Map<String, Boolean>>> application;

	private final Map<String, Boolean> cluster;

	private final boolean hasAllRequested;

	private final Map<String, Map<String, Boolean>> index;

	private final String username;

	// ---------------------------------------------------------------------------------------------

	private HasPrivilegesResponse(Builder builder) {

		this.application = ModelTypeHelper.unmodifiableRequired(builder.application, this, "application");
		this.cluster = ModelTypeHelper.unmodifiableRequired(builder.cluster, this, "cluster");
		this.hasAllRequested = ModelTypeHelper.requireNonNull(builder.hasAllRequested, this, "hasAllRequested");
		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.username = ModelTypeHelper.requireNonNull(builder.username, this, "username");

	}

	public static HasPrivilegesResponse of(Function<Builder, ObjectBuilder<HasPrivilegesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code application}
	 */
	public final Map<String, Map<String, Map<String, Boolean>>> application() {
		return this.application;
	}

	/**
	 * Required - API name: {@code cluster}
	 */
	public final Map<String, Boolean> cluster() {
		return this.cluster;
	}

	/**
	 * Required - API name: {@code has_all_requested}
	 */
	public final boolean hasAllRequested() {
		return this.hasAllRequested;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final Map<String, Map<String, Boolean>> index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code username}
	 */
	public final String username() {
		return this.username;
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

		if (ModelTypeHelper.isDefined(this.application)) {
			generator.writeKey("application");
			generator.writeStartObject();
			for (Map.Entry<String, Map<String, Map<String, Boolean>>> item0 : this.application.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartObject();
				if (item0.getValue() != null) {
					for (Map.Entry<String, Map<String, Boolean>> item1 : item0.getValue().entrySet()) {
						generator.writeKey(item1.getKey());
						generator.writeStartObject();
						if (item1.getValue() != null) {
							for (Map.Entry<String, Boolean> item2 : item1.getValue().entrySet()) {
								generator.writeKey(item2.getKey());
								generator.write(item2.getValue());

							}
						}
						generator.writeEnd();

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartObject();
			for (Map.Entry<String, Boolean> item0 : this.cluster.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("has_all_requested");
		generator.write(this.hasAllRequested);

		if (ModelTypeHelper.isDefined(this.index)) {
			generator.writeKey("index");
			generator.writeStartObject();
			for (Map.Entry<String, Map<String, Boolean>> item0 : this.index.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartObject();
				if (item0.getValue() != null) {
					for (Map.Entry<String, Boolean> item1 : item0.getValue().entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		generator.writeKey("username");
		generator.write(this.username);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HasPrivilegesResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HasPrivilegesResponse> {
		private Map<String, Map<String, Map<String, Boolean>>> application;

		private Map<String, Boolean> cluster;

		private Boolean hasAllRequested;

		private Map<String, Map<String, Boolean>> index;

		private String username;

		/**
		 * Required - API name: {@code application}
		 */
		public final Builder application(Map<String, Map<String, Map<String, Boolean>>> value) {
			this.application = value;
			return this;
		}

		/**
		 * Required - API name: {@code cluster}
		 */
		public final Builder cluster(Map<String, Boolean> value) {
			this.cluster = value;
			return this;
		}

		/**
		 * Required - API name: {@code has_all_requested}
		 */
		public final Builder hasAllRequested(boolean value) {
			this.hasAllRequested = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(Map<String, Map<String, Boolean>> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Builds a {@link HasPrivilegesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HasPrivilegesResponse build() {
			_checkSingleUse();

			return new HasPrivilegesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HasPrivilegesResponse}
	 */
	public static final JsonpDeserializer<HasPrivilegesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HasPrivilegesResponse::setupHasPrivilegesResponseDeserializer, Builder::build);

	protected static void setupHasPrivilegesResponseDeserializer(
			DelegatingDeserializer<HasPrivilegesResponse.Builder> op) {

		op.add(Builder::application,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.booleanDeserializer()))),
				"application");
		op.add(Builder::cluster, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.booleanDeserializer()),
				"cluster");
		op.add(Builder::hasAllRequested, JsonpDeserializer.booleanDeserializer(), "has_all_requested");
		op.add(Builder::index, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.booleanDeserializer())), "index");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");

	}

}
