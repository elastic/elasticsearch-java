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

package co.elastic.clients.elasticsearch.security.has_privileges;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.has_privileges.ApplicationPrivilegesCheck

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.has_privileges.ApplicationPrivilegesCheck">API
 *      specification</a>
 */
@JsonpDeserializable
public class ApplicationPrivilegesCheck implements JsonpSerializable {
	private final String application;

	private final List<String> privileges;

	private final List<String> resources;

	// ---------------------------------------------------------------------------------------------

	private ApplicationPrivilegesCheck(Builder builder) {

		this.application = ApiTypeHelper.requireNonNull(builder.application, this, "application");
		this.privileges = ApiTypeHelper.unmodifiableRequired(builder.privileges, this, "privileges");
		this.resources = ApiTypeHelper.unmodifiableRequired(builder.resources, this, "resources");

	}

	public static ApplicationPrivilegesCheck of(Function<Builder, ObjectBuilder<ApplicationPrivilegesCheck>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the application.
	 * <p>
	 * API name: {@code application}
	 */
	public final String application() {
		return this.application;
	}

	/**
	 * Required - A list of the privileges that you want to check for the specified
	 * resources. May be either application privilege names, or the names of actions
	 * that are granted by those privileges
	 * <p>
	 * API name: {@code privileges}
	 */
	public final List<String> privileges() {
		return this.privileges;
	}

	/**
	 * Required - A list of resource names against which the privileges should be
	 * checked
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

		if (ApiTypeHelper.isDefined(this.privileges)) {
			generator.writeKey("privileges");
			generator.writeStartArray();
			for (String item0 : this.privileges) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.resources)) {
			generator.writeKey("resources");
			generator.writeStartArray();
			for (String item0 : this.resources) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ApplicationPrivilegesCheck}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ApplicationPrivilegesCheck> {
		private String application;

		private List<String> privileges;

		private List<String> resources;

		/**
		 * Required - The name of the application.
		 * <p>
		 * API name: {@code application}
		 */
		public final Builder application(String value) {
			this.application = value;
			return this;
		}

		/**
		 * Required - A list of the privileges that you want to check for the specified
		 * resources. May be either application privilege names, or the names of actions
		 * that are granted by those privileges
		 * <p>
		 * API name: {@code privileges}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>privileges</code>.
		 */
		public final Builder privileges(List<String> list) {
			this.privileges = _listAddAll(this.privileges, list);
			return this;
		}

		/**
		 * Required - A list of the privileges that you want to check for the specified
		 * resources. May be either application privilege names, or the names of actions
		 * that are granted by those privileges
		 * <p>
		 * API name: {@code privileges}
		 * <p>
		 * Adds one or more values to <code>privileges</code>.
		 */
		public final Builder privileges(String value, String... values) {
			this.privileges = _listAdd(this.privileges, value, values);
			return this;
		}

		/**
		 * Required - A list of resource names against which the privileges should be
		 * checked
		 * <p>
		 * API name: {@code resources}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>resources</code>.
		 */
		public final Builder resources(List<String> list) {
			this.resources = _listAddAll(this.resources, list);
			return this;
		}

		/**
		 * Required - A list of resource names against which the privileges should be
		 * checked
		 * <p>
		 * API name: {@code resources}
		 * <p>
		 * Adds one or more values to <code>resources</code>.
		 */
		public final Builder resources(String value, String... values) {
			this.resources = _listAdd(this.resources, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ApplicationPrivilegesCheck}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ApplicationPrivilegesCheck build() {
			_checkSingleUse();

			return new ApplicationPrivilegesCheck(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ApplicationPrivilegesCheck}
	 */
	public static final JsonpDeserializer<ApplicationPrivilegesCheck> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ApplicationPrivilegesCheck::setupApplicationPrivilegesCheckDeserializer);

	protected static void setupApplicationPrivilegesCheckDeserializer(
			ObjectDeserializer<ApplicationPrivilegesCheck.Builder> op) {

		op.add(Builder::application, JsonpDeserializer.stringDeserializer(), "application");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"privileges");
		op.add(Builder::resources, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"resources");

	}

}
