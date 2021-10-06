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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.ApplicationPrivileges
@JsonpDeserializable
public final class ApplicationPrivileges implements JsonpSerializable {
	private final String application;

	private final List<String> privileges;

	private final List<String> resources;

	// ---------------------------------------------------------------------------------------------

	public ApplicationPrivileges(Builder builder) {

		this.application = Objects.requireNonNull(builder.application, "application");
		this.privileges = ModelTypeHelper.unmodifiableNonNull(builder.privileges, "privileges");
		this.resources = ModelTypeHelper.unmodifiableNonNull(builder.resources, "resources");

	}

	public ApplicationPrivileges(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The name of the application to which this entry applies.
	 * <p>
	 * API name: {@code application}
	 */
	public String application() {
		return this.application;
	}

	/**
	 * Required - A list of strings, where each element is the name of an
	 * application privilege or action.
	 * <p>
	 * API name: {@code privileges}
	 */
	public List<String> privileges() {
		return this.privileges;
	}

	/**
	 * Required - A list resources to which the privileges are applied.
	 * <p>
	 * API name: {@code resources}
	 */
	public List<String> resources() {
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

		generator.writeKey("privileges");
		generator.writeStartArray();
		for (String item0 : this.privileges) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("resources");
		generator.writeStartArray();
		for (String item0 : this.resources) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ApplicationPrivileges}.
	 */
	public static class Builder implements ObjectBuilder<ApplicationPrivileges> {
		private String application;

		private List<String> privileges;

		private List<String> resources;

		/**
		 * Required - The name of the application to which this entry applies.
		 * <p>
		 * API name: {@code application}
		 */
		public Builder application(String value) {
			this.application = value;
			return this;
		}

		/**
		 * Required - A list of strings, where each element is the name of an
		 * application privilege or action.
		 * <p>
		 * API name: {@code privileges}
		 */
		public Builder privileges(List<String> value) {
			this.privileges = value;
			return this;
		}

		/**
		 * Required - A list of strings, where each element is the name of an
		 * application privilege or action.
		 * <p>
		 * API name: {@code privileges}
		 */
		public Builder privileges(String... value) {
			this.privileges = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #privileges(List)}, creating the list if needed.
		 */
		public Builder addPrivileges(String value) {
			if (this.privileges == null) {
				this.privileges = new ArrayList<>();
			}
			this.privileges.add(value);
			return this;
		}

		/**
		 * Required - A list resources to which the privileges are applied.
		 * <p>
		 * API name: {@code resources}
		 */
		public Builder resources(List<String> value) {
			this.resources = value;
			return this;
		}

		/**
		 * Required - A list resources to which the privileges are applied.
		 * <p>
		 * API name: {@code resources}
		 */
		public Builder resources(String... value) {
			this.resources = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #resources(List)}, creating the list if needed.
		 */
		public Builder addResources(String value) {
			if (this.resources == null) {
				this.resources = new ArrayList<>();
			}
			this.resources.add(value);
			return this;
		}

		/**
		 * Builds a {@link ApplicationPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ApplicationPrivileges build() {

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
