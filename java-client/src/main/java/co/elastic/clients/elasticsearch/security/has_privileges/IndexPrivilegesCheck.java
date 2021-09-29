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

import co.elastic.clients.elasticsearch.security.IndexPrivilege;
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

// typedef: security.has_privileges.IndexPrivilegesCheck
@JsonpDeserializable
public final class IndexPrivilegesCheck implements JsonpSerializable {
	private final List<String> names;

	private final List<IndexPrivilege> privileges;

	// ---------------------------------------------------------------------------------------------

	public IndexPrivilegesCheck(Builder builder) {

		this.names = ModelTypeHelper.unmodifiableNonNull(builder.names, "names");
		this.privileges = ModelTypeHelper.unmodifiableNonNull(builder.privileges, "privileges");

	}

	public IndexPrivilegesCheck(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code names}
	 */
	public List<String> names() {
		return this.names;
	}

	/**
	 * API name: {@code privileges}
	 */
	public List<IndexPrivilege> privileges() {
		return this.privileges;
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

		generator.writeKey("names");
		generator.writeStartArray();
		for (String item0 : this.names) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("privileges");
		generator.writeStartArray();
		for (IndexPrivilege item0 : this.privileges) {
			item0.serialize(generator, mapper);
		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexPrivilegesCheck}.
	 */
	public static class Builder implements ObjectBuilder<IndexPrivilegesCheck> {
		private List<String> names;

		private List<IndexPrivilege> privileges;

		/**
		 * API name: {@code names}
		 */
		public Builder names(List<String> value) {
			this.names = value;
			return this;
		}

		/**
		 * API name: {@code names}
		 */
		public Builder names(String... value) {
			this.names = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #names(List)}, creating the list if needed. 4
		 */
		public Builder addNames(String value) {
			if (this.names == null) {
				this.names = new ArrayList<>();
			}
			this.names.add(value);
			return this;
		}

		/**
		 * API name: {@code privileges}
		 */
		public Builder privileges(List<IndexPrivilege> value) {
			this.privileges = value;
			return this;
		}

		/**
		 * API name: {@code privileges}
		 */
		public Builder privileges(IndexPrivilege... value) {
			this.privileges = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #privileges(List)}, creating the list if needed. 4
		 */
		public Builder addPrivileges(IndexPrivilege value) {
			if (this.privileges == null) {
				this.privileges = new ArrayList<>();
			}
			this.privileges.add(value);
			return this;
		}

		/**
		 * Builds a {@link IndexPrivilegesCheck}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexPrivilegesCheck build() {

			return new IndexPrivilegesCheck(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexPrivilegesCheck}
	 */
	public static final JsonpDeserializer<IndexPrivilegesCheck> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexPrivilegesCheck::setupIndexPrivilegesCheckDeserializer, Builder::build);

	protected static void setupIndexPrivilegesCheckDeserializer(
			DelegatingDeserializer<IndexPrivilegesCheck.Builder> op) {

		op.add(Builder::names, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "names");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(IndexPrivilege._DESERIALIZER), "privileges");

	}

}
