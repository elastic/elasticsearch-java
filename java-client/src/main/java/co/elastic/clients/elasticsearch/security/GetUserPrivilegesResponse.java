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

// typedef: security.get_user_privileges.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.get_user_privileges.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetUserPrivilegesResponse implements JsonpSerializable {
	private final List<ApplicationPrivileges> applications;

	private final List<String> cluster;

	private final List<GlobalPrivilege> global;

	private final List<UserIndicesPrivileges> indices;

	private final List<String> runAs;

	// ---------------------------------------------------------------------------------------------

	private GetUserPrivilegesResponse(Builder builder) {

		this.applications = ApiTypeHelper.unmodifiableRequired(builder.applications, this, "applications");
		this.cluster = ApiTypeHelper.unmodifiableRequired(builder.cluster, this, "cluster");
		this.global = ApiTypeHelper.unmodifiableRequired(builder.global, this, "global");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.runAs = ApiTypeHelper.unmodifiableRequired(builder.runAs, this, "runAs");

	}

	public static GetUserPrivilegesResponse of(Function<Builder, ObjectBuilder<GetUserPrivilegesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code applications}
	 */
	public final List<ApplicationPrivileges> applications() {
		return this.applications;
	}

	/**
	 * Required - API name: {@code cluster}
	 */
	public final List<String> cluster() {
		return this.cluster;
	}

	/**
	 * Required - API name: {@code global}
	 */
	public final List<GlobalPrivilege> global() {
		return this.global;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<UserIndicesPrivileges> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code run_as}
	 */
	public final List<String> runAs() {
		return this.runAs;
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
			for (ApplicationPrivileges item0 : this.applications) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartArray();
			for (String item0 : this.cluster) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.global)) {
			generator.writeKey("global");
			generator.writeStartArray();
			for (GlobalPrivilege item0 : this.global) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (UserIndicesPrivileges item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.runAs)) {
			generator.writeKey("run_as");
			generator.writeStartArray();
			for (String item0 : this.runAs) {
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
	 * Builder for {@link GetUserPrivilegesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetUserPrivilegesResponse> {
		private List<ApplicationPrivileges> applications;

		private List<String> cluster;

		private List<GlobalPrivilege> global;

		private List<UserIndicesPrivileges> indices;

		private List<String> runAs;

		/**
		 * Required - API name: {@code applications}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>applications</code>.
		 */
		public final Builder applications(List<ApplicationPrivileges> list) {
			this.applications = _listAddAll(this.applications, list);
			return this;
		}

		/**
		 * Required - API name: {@code applications}
		 * <p>
		 * Adds one or more values to <code>applications</code>.
		 */
		public final Builder applications(ApplicationPrivileges value, ApplicationPrivileges... values) {
			this.applications = _listAdd(this.applications, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code applications}
		 * <p>
		 * Adds a value to <code>applications</code> using a builder lambda.
		 */
		public final Builder applications(
				Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>> fn) {
			return applications(fn.apply(new ApplicationPrivileges.Builder()).build());
		}

		/**
		 * Required - API name: {@code cluster}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>cluster</code>.
		 */
		public final Builder cluster(List<String> list) {
			this.cluster = _listAddAll(this.cluster, list);
			return this;
		}

		/**
		 * Required - API name: {@code cluster}
		 * <p>
		 * Adds one or more values to <code>cluster</code>.
		 */
		public final Builder cluster(String value, String... values) {
			this.cluster = _listAdd(this.cluster, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code global}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>global</code>.
		 */
		public final Builder global(List<GlobalPrivilege> list) {
			this.global = _listAddAll(this.global, list);
			return this;
		}

		/**
		 * Required - API name: {@code global}
		 * <p>
		 * Adds one or more values to <code>global</code>.
		 */
		public final Builder global(GlobalPrivilege value, GlobalPrivilege... values) {
			this.global = _listAdd(this.global, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code global}
		 * <p>
		 * Adds a value to <code>global</code> using a builder lambda.
		 */
		public final Builder global(Function<GlobalPrivilege.Builder, ObjectBuilder<GlobalPrivilege>> fn) {
			return global(fn.apply(new GlobalPrivilege.Builder()).build());
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<UserIndicesPrivileges> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(UserIndicesPrivileges value, UserIndicesPrivileges... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(Function<UserIndicesPrivileges.Builder, ObjectBuilder<UserIndicesPrivileges>> fn) {
			return indices(fn.apply(new UserIndicesPrivileges.Builder()).build());
		}

		/**
		 * Required - API name: {@code run_as}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>runAs</code>.
		 */
		public final Builder runAs(List<String> list) {
			this.runAs = _listAddAll(this.runAs, list);
			return this;
		}

		/**
		 * Required - API name: {@code run_as}
		 * <p>
		 * Adds one or more values to <code>runAs</code>.
		 */
		public final Builder runAs(String value, String... values) {
			this.runAs = _listAdd(this.runAs, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetUserPrivilegesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetUserPrivilegesResponse build() {
			_checkSingleUse();

			return new GetUserPrivilegesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetUserPrivilegesResponse}
	 */
	public static final JsonpDeserializer<GetUserPrivilegesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetUserPrivilegesResponse::setupGetUserPrivilegesResponseDeserializer);

	protected static void setupGetUserPrivilegesResponseDeserializer(
			ObjectDeserializer<GetUserPrivilegesResponse.Builder> op) {

		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges._DESERIALIZER),
				"applications");
		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::global, JsonpDeserializer.arrayDeserializer(GlobalPrivilege._DESERIALIZER), "global");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(UserIndicesPrivileges._DESERIALIZER), "indices");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");

	}

}
