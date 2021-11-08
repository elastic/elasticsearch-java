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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_user_privileges.Response
@JsonpDeserializable
public class GetUserPrivilegesResponse implements JsonpSerializable {
	private final List<ApplicationPrivileges> applications;

	private final List<String> cluster;

	private final List<GlobalPrivilege> global;

	private final List<IndicesPrivileges> indices;

	private final List<String> runAs;

	// ---------------------------------------------------------------------------------------------

	private GetUserPrivilegesResponse(Builder builder) {

		this.applications = ModelTypeHelper.unmodifiableRequired(builder.applications, this, "applications");
		this.cluster = ModelTypeHelper.unmodifiableRequired(builder.cluster, this, "cluster");
		this.global = ModelTypeHelper.unmodifiableRequired(builder.global, this, "global");
		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.runAs = ModelTypeHelper.unmodifiableRequired(builder.runAs, this, "runAs");

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
	public final List<IndicesPrivileges> indices() {
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

		if (ModelTypeHelper.isDefined(this.applications)) {
			generator.writeKey("applications");
			generator.writeStartArray();
			for (ApplicationPrivileges item0 : this.applications) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartArray();
			for (String item0 : this.cluster) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.global)) {
			generator.writeKey("global");
			generator.writeStartArray();
			for (GlobalPrivilege item0 : this.global) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (IndicesPrivileges item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.runAs)) {
			generator.writeKey("run_as");
			generator.writeStartArray();
			for (String item0 : this.runAs) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetUserPrivilegesResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetUserPrivilegesResponse> {
		private List<ApplicationPrivileges> applications;

		private List<String> cluster;

		private List<GlobalPrivilege> global;

		private List<IndicesPrivileges> indices;

		private List<String> runAs;

		/**
		 * Required - API name: {@code applications}
		 */
		public final Builder applications(List<ApplicationPrivileges> value) {
			this.applications = value;
			return this;
		}

		/**
		 * Required - API name: {@code applications}
		 */
		public final Builder applications(ApplicationPrivileges... value) {
			this.applications = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code applications}
		 */
		@SafeVarargs
		public final Builder applications(
				Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>>... fns) {
			this.applications = new ArrayList<>(fns.length);
			for (Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>> fn : fns) {
				this.applications.add(fn.apply(new ApplicationPrivileges.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code cluster}
		 */
		public final Builder cluster(List<String> value) {
			this.cluster = value;
			return this;
		}

		/**
		 * Required - API name: {@code cluster}
		 */
		public final Builder cluster(String... value) {
			this.cluster = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code global}
		 */
		public final Builder global(List<GlobalPrivilege> value) {
			this.global = value;
			return this;
		}

		/**
		 * Required - API name: {@code global}
		 */
		public final Builder global(GlobalPrivilege... value) {
			this.global = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code global}
		 */
		@SafeVarargs
		public final Builder global(Function<GlobalPrivilege.Builder, ObjectBuilder<GlobalPrivilege>>... fns) {
			this.global = new ArrayList<>(fns.length);
			for (Function<GlobalPrivilege.Builder, ObjectBuilder<GlobalPrivilege>> fn : fns) {
				this.global.add(fn.apply(new GlobalPrivilege.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(List<IndicesPrivileges> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(IndicesPrivileges... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		@SafeVarargs
		public final Builder indices(Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>>... fns) {
			this.indices = new ArrayList<>(fns.length);
			for (Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>> fn : fns) {
				this.indices.add(fn.apply(new IndicesPrivileges.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code run_as}
		 */
		public final Builder runAs(List<String> value) {
			this.runAs = value;
			return this;
		}

		/**
		 * Required - API name: {@code run_as}
		 */
		public final Builder runAs(String... value) {
			this.runAs = Arrays.asList(value);
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
			.lazy(Builder::new, GetUserPrivilegesResponse::setupGetUserPrivilegesResponseDeserializer, Builder::build);

	protected static void setupGetUserPrivilegesResponseDeserializer(
			DelegatingDeserializer<GetUserPrivilegesResponse.Builder> op) {

		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges._DESERIALIZER),
				"applications");
		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::global, JsonpDeserializer.arrayDeserializer(GlobalPrivilege._DESERIALIZER), "global");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesPrivileges._DESERIALIZER), "indices");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");

	}

}
