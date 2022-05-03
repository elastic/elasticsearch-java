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

// typedef: security._types.ManageUserPrivileges

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.ManageUserPrivileges">API
 *      specification</a>
 */
@JsonpDeserializable
public class ManageUserPrivileges implements JsonpSerializable {
	private final List<String> applications;

	// ---------------------------------------------------------------------------------------------

	private ManageUserPrivileges(Builder builder) {

		this.applications = ApiTypeHelper.unmodifiableRequired(builder.applications, this, "applications");

	}

	public static ManageUserPrivileges of(Function<Builder, ObjectBuilder<ManageUserPrivileges>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code applications}
	 */
	public final List<String> applications() {
		return this.applications;
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

		if (ApiTypeHelper.isDefined(this.applications)) {
			generator.writeKey("applications");
			generator.writeStartArray();
			for (String item0 : this.applications) {
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
	 * Builder for {@link ManageUserPrivileges}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ManageUserPrivileges> {
		private List<String> applications;

		/**
		 * Required - API name: {@code applications}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>applications</code>.
		 */
		public final Builder applications(List<String> list) {
			this.applications = _listAddAll(this.applications, list);
			return this;
		}

		/**
		 * Required - API name: {@code applications}
		 * <p>
		 * Adds one or more values to <code>applications</code>.
		 */
		public final Builder applications(String value, String... values) {
			this.applications = _listAdd(this.applications, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ManageUserPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ManageUserPrivileges build() {
			_checkSingleUse();

			return new ManageUserPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ManageUserPrivileges}
	 */
	public static final JsonpDeserializer<ManageUserPrivileges> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ManageUserPrivileges::setupManageUserPrivilegesDeserializer);

	protected static void setupManageUserPrivilegesDeserializer(ObjectDeserializer<ManageUserPrivileges.Builder> op) {

		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"applications");

	}

}
