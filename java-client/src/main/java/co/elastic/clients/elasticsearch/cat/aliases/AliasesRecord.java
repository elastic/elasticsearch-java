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

package co.elastic.clients.elasticsearch.cat.aliases;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.aliases.AliasesRecord
public final class AliasesRecord implements ToJsonp {
	@Nullable
	private final String alias;

	@Nullable
	private final String index;

	@Nullable
	private final String filter;

	@Nullable
	private final String routing_index;

	@Nullable
	private final String routing_search;

	@Nullable
	private final String isWriteIndex;

	// ---------------------------------------------------------------------------------------------

	protected AliasesRecord(Builder builder) {

		this.alias = builder.alias;
		this.index = builder.index;
		this.filter = builder.filter;
		this.routing_index = builder.routing_index;
		this.routing_search = builder.routing_search;
		this.isWriteIndex = builder.isWriteIndex;

	}

	/**
	 * alias name
	 *
	 * API name: {@code alias}
	 */
	@Nullable
	public String alias() {
		return this.alias;
	}

	/**
	 * index alias points to
	 *
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * filter
	 *
	 * API name: {@code filter}
	 */
	@Nullable
	public String filter() {
		return this.filter;
	}

	/**
	 * index routing
	 *
	 * API name: {@code routing.index}
	 */
	@Nullable
	public String routing_index() {
		return this.routing_index;
	}

	/**
	 * search routing
	 *
	 * API name: {@code routing.search}
	 */
	@Nullable
	public String routing_search() {
		return this.routing_search;
	}

	/**
	 * write index
	 *
	 * API name: {@code is_write_index}
	 */
	@Nullable
	public String isWriteIndex() {
		return this.isWriteIndex;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.alias != null) {

			generator.writeKey("alias");
			generator.write(this.alias);

		}
		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			generator.write(this.filter);

		}
		if (this.routing_index != null) {

			generator.writeKey("routing.index");
			generator.write(this.routing_index);

		}
		if (this.routing_search != null) {

			generator.writeKey("routing.search");
			generator.write(this.routing_search);

		}
		if (this.isWriteIndex != null) {

			generator.writeKey("is_write_index");
			generator.write(this.isWriteIndex);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AliasesRecord}.
	 */
	public static class Builder implements ObjectBuilder<AliasesRecord> {
		@Nullable
		private String alias;

		@Nullable
		private String index;

		@Nullable
		private String filter;

		@Nullable
		private String routing_index;

		@Nullable
		private String routing_search;

		@Nullable
		private String isWriteIndex;

		/**
		 * alias name
		 *
		 * API name: {@code alias}
		 */
		public Builder alias(@Nullable String value) {
			this.alias = value;
			return this;
		}

		/**
		 * index alias points to
		 *
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * filter
		 *
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable String value) {
			this.filter = value;
			return this;
		}

		/**
		 * index routing
		 *
		 * API name: {@code routing.index}
		 */
		public Builder routing_index(@Nullable String value) {
			this.routing_index = value;
			return this;
		}

		/**
		 * search routing
		 *
		 * API name: {@code routing.search}
		 */
		public Builder routing_search(@Nullable String value) {
			this.routing_search = value;
			return this;
		}

		/**
		 * write index
		 *
		 * API name: {@code is_write_index}
		 */
		public Builder isWriteIndex(@Nullable String value) {
			this.isWriteIndex = value;
			return this;
		}

		/**
		 * Builds a {@link AliasesRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AliasesRecord build() {

			return new AliasesRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AliasesRecord
	 */
	public static final JsonpDeserializer<AliasesRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AliasesRecord::setupAliasesRecordDeserializer);

	protected static void setupAliasesRecordDeserializer(DelegatingDeserializer<AliasesRecord.Builder> op) {

		op.add(Builder::alias, JsonpDeserializer.stringDeserializer(), "alias", "a");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index", "i", "idx");
		op.add(Builder::filter, JsonpDeserializer.stringDeserializer(), "filter", "f", "fi");
		op.add(Builder::routing_index, JsonpDeserializer.stringDeserializer(), "routing.index", "ri", "routingIndex");
		op.add(Builder::routing_search, JsonpDeserializer.stringDeserializer(), "routing.search", "rs",
				"routingSearch");
		op.add(Builder::isWriteIndex, JsonpDeserializer.stringDeserializer(), "is_write_index", "w", "isWriteIndex");

	}

}
