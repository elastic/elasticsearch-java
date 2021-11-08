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

// typedef: security.get_builtin_privileges.Response
@JsonpDeserializable
public class GetBuiltinPrivilegesResponse implements JsonpSerializable {
	private final List<String> cluster;

	private final List<String> index;

	// ---------------------------------------------------------------------------------------------

	private GetBuiltinPrivilegesResponse(Builder builder) {

		this.cluster = ModelTypeHelper.unmodifiableRequired(builder.cluster, this, "cluster");
		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");

	}

	public static GetBuiltinPrivilegesResponse of(Function<Builder, ObjectBuilder<GetBuiltinPrivilegesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cluster}
	 */
	public final List<String> cluster() {
		return this.cluster;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
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

		if (ModelTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartArray();
			for (String item0 : this.cluster) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.index)) {
			generator.writeKey("index");
			generator.writeStartArray();
			for (String item0 : this.index) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetBuiltinPrivilegesResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetBuiltinPrivilegesResponse> {
		private List<String> cluster;

		private List<String> index;

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
		 * Required - API name: {@code index}
		 */
		public final Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link GetBuiltinPrivilegesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetBuiltinPrivilegesResponse build() {
			_checkSingleUse();

			return new GetBuiltinPrivilegesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetBuiltinPrivilegesResponse}
	 */
	public static final JsonpDeserializer<GetBuiltinPrivilegesResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, GetBuiltinPrivilegesResponse::setupGetBuiltinPrivilegesResponseDeserializer, Builder::build);

	protected static void setupGetBuiltinPrivilegesResponseDeserializer(
			DelegatingDeserializer<GetBuiltinPrivilegesResponse.Builder> op) {

		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "index");

	}

}
