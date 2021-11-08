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
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.ApplicationPrivileges
@JsonpDeserializable
public class ApplicationPrivileges implements JsonpSerializable {
	private final String application;

	private final List<String> privileges;

	private final List<String> resources;

	// ---------------------------------------------------------------------------------------------

	private ApplicationPrivileges(Builder builder) {

		this.application = ModelTypeHelper.requireNonNull(builder.application, this, "application");
		this.privileges = ModelTypeHelper.unmodifiableRequired(builder.privileges, this, "privileges");
		this.resources = ModelTypeHelper.unmodifiableRequired(builder.resources, this, "resources");

	}

	public static ApplicationPrivileges of(Function<Builder, ObjectBuilder<ApplicationPrivileges>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the application to which this entry applies.
	 * <p>
	 * API name: {@code application}
	 */
	public final String application() {
		return this.application;
	}

	/**
	 * Required - A list of strings, where each element is the name of an
	 * application privilege or action.
	 * <p>
	 * API name: {@code privileges}
	 */
	public final List<String> privileges() {
		return this.privileges;
	}

	/**
	 * Required - A list resources to which the privileges are applied.
	 * <p>
	 * API name: {@code resources}
	 */
	public final List<String> resources() {
		return this.resources;
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

		generator.writeKey("application");
		generator.write(this.application);

		if (ModelTypeHelper.isDefined(this.privileges)) {
			generator.writeKey("privileges");
			generator.writeStartArray();
			for (String item0 : this.privileges) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.resources)) {
			generator.writeKey("resources");
			generator.writeStartArray();
			for (String item0 : this.resources) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ApplicationPrivileges}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ApplicationPrivileges> {
		private String application;

		private List<String> privileges;

		private List<String> resources;

		/**
		 * Required - The name of the application to which this entry applies.
		 * <p>
		 * API name: {@code application}
		 */
		public final Builder application(String value) {
			this.application = value;
			return this;
		}

		/**
		 * Required - A list of strings, where each element is the name of an
		 * application privilege or action.
		 * <p>
		 * API name: {@code privileges}
		 */
		public final Builder privileges(List<String> value) {
			this.privileges = value;
			return this;
		}

		/**
		 * Required - A list of strings, where each element is the name of an
		 * application privilege or action.
		 * <p>
		 * API name: {@code privileges}
		 */
		public final Builder privileges(String... value) {
			this.privileges = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - A list resources to which the privileges are applied.
		 * <p>
		 * API name: {@code resources}
		 */
		public final Builder resources(List<String> value) {
			this.resources = value;
			return this;
		}

		/**
		 * Required - A list resources to which the privileges are applied.
		 * <p>
		 * API name: {@code resources}
		 */
		public final Builder resources(String... value) {
			this.resources = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link ApplicationPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ApplicationPrivileges build() {
			_checkSingleUse();

			return new ApplicationPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ApplicationPrivileges}
	 */
	public static final JsonpDeserializer<ApplicationPrivileges> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ApplicationPrivileges::setupApplicationPrivilegesDeserializer, Builder::build);

	protected static void setupApplicationPrivilegesDeserializer(
			DelegatingDeserializer<ApplicationPrivileges.Builder> op) {

		op.add(Builder::application, JsonpDeserializer.stringDeserializer(), "application");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"privileges");
		op.add(Builder::resources, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"resources");

	}

}
