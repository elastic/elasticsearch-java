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
import jakarta.json.stream.JsonParser;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.put_privileges.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.put_privileges.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutPrivilegesResponse implements JsonpSerializable {
	private final Map<String, Map<String, CreatedStatus>> result;

	// ---------------------------------------------------------------------------------------------

	private PutPrivilegesResponse(Builder builder) {

		this.result = ApiTypeHelper.unmodifiableRequired(builder.result, this, "result");

	}

	public static PutPrivilegesResponse of(Function<Builder, ObjectBuilder<PutPrivilegesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final Map<String, Map<String, CreatedStatus>> result() {
		return this.result;
	}

	/**
	 * Get an element of {@code result}.
	 */
	public final @Nullable Map<String, CreatedStatus> get(String key) {
		return this.result.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, Map<String, CreatedStatus>> item0 : this.result.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartObject();
			if (item0.getValue() != null) {
				for (Map.Entry<String, CreatedStatus> item1 : item0.getValue().entrySet()) {
					generator.writeKey(item1.getKey());
					item1.getValue().serialize(generator, mapper);

				}
			}
			generator.writeEnd();

		}
		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutPrivilegesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PutPrivilegesResponse> {
		private Map<String, Map<String, CreatedStatus>> result = new HashMap<>();

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>result</code>.
		 */
		public final Builder result(Map<String, Map<String, CreatedStatus>> map) {
			this.result = _mapPutAll(this.result, map);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>result</code>.
		 */
		public final Builder result(String key, Map<String, CreatedStatus> value) {
			this.result = _mapPut(this.result, key, value);
			return this;
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, Map<String, CreatedStatus>> value = (Map<String, Map<String, CreatedStatus>>) JsonpDeserializer
					.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(CreatedStatus._DESERIALIZER))
					.deserialize(parser, mapper);
			return this.result(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutPrivilegesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutPrivilegesResponse build() {
			_checkSingleUse();

			return new PutPrivilegesResponse(this);
		}
	}

	public static final JsonpDeserializer<PutPrivilegesResponse> _DESERIALIZER = createPutPrivilegesResponseDeserializer();
	protected static JsonpDeserializer<PutPrivilegesResponse> createPutPrivilegesResponseDeserializer() {

		JsonpDeserializer<Map<String, Map<String, CreatedStatus>>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(CreatedStatus._DESERIALIZER));

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(),
				(parser, mapper) -> new Builder().result(valueDeserializer.deserialize(parser, mapper)).build());
	}

}
