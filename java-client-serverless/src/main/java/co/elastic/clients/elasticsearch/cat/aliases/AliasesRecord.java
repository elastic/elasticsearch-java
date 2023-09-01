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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.aliases.AliasesRecord

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cat.aliases.AliasesRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class AliasesRecord implements JsonpSerializable {
	@Nullable
	private final String alias;

	@Nullable
	private final String index;

	@Nullable
	private final String filter;

	@Nullable
	private final String routingIndex;

	@Nullable
	private final String routingSearch;

	@Nullable
	private final String isWriteIndex;

	// ---------------------------------------------------------------------------------------------

	private AliasesRecord(Builder builder) {

		this.alias = builder.alias;
		this.index = builder.index;
		this.filter = builder.filter;
		this.routingIndex = builder.routingIndex;
		this.routingSearch = builder.routingSearch;
		this.isWriteIndex = builder.isWriteIndex;

	}

	public static AliasesRecord of(Function<Builder, ObjectBuilder<AliasesRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * alias name
	 * <p>
	 * API name: {@code alias}
	 */
	@Nullable
	public final String alias() {
		return this.alias;
	}

	/**
	 * index alias points to
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * filter
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final String filter() {
		return this.filter;
	}

	/**
	 * index routing
	 * <p>
	 * API name: {@code routing.index}
	 */
	@Nullable
	public final String routingIndex() {
		return this.routingIndex;
	}

	/**
	 * search routing
	 * <p>
	 * API name: {@code routing.search}
	 */
	@Nullable
	public final String routingSearch() {
		return this.routingSearch;
	}

	/**
	 * write index
	 * <p>
	 * API name: {@code is_write_index}
	 */
	@Nullable
	public final String isWriteIndex() {
		return this.isWriteIndex;
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
		if (this.routingIndex != null) {
			generator.writeKey("routing.index");
			generator.write(this.routingIndex);

		}
		if (this.routingSearch != null) {
			generator.writeKey("routing.search");
			generator.write(this.routingSearch);

		}
		if (this.isWriteIndex != null) {
			generator.writeKey("is_write_index");
			generator.write(this.isWriteIndex);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AliasesRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AliasesRecord> {
		@Nullable
		private String alias;

		@Nullable
		private String index;

		@Nullable
		private String filter;

		@Nullable
		private String routingIndex;

		@Nullable
		private String routingSearch;

		@Nullable
		private String isWriteIndex;

		/**
		 * alias name
		 * <p>
		 * API name: {@code alias}
		 */
		public final Builder alias(@Nullable String value) {
			this.alias = value;
			return this;
		}

		/**
		 * index alias points to
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * filter
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable String value) {
			this.filter = value;
			return this;
		}

		/**
		 * index routing
		 * <p>
		 * API name: {@code routing.index}
		 */
		public final Builder routingIndex(@Nullable String value) {
			this.routingIndex = value;
			return this;
		}

		/**
		 * search routing
		 * <p>
		 * API name: {@code routing.search}
		 */
		public final Builder routingSearch(@Nullable String value) {
			this.routingSearch = value;
			return this;
		}

		/**
		 * write index
		 * <p>
		 * API name: {@code is_write_index}
		 */
		public final Builder isWriteIndex(@Nullable String value) {
			this.isWriteIndex = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AliasesRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AliasesRecord build() {
			_checkSingleUse();

			return new AliasesRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AliasesRecord}
	 */
	public static final JsonpDeserializer<AliasesRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AliasesRecord::setupAliasesRecordDeserializer);

	protected static void setupAliasesRecordDeserializer(ObjectDeserializer<AliasesRecord.Builder> op) {

		op.add(Builder::alias, JsonpDeserializer.stringDeserializer(), "alias", "a");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index", "i", "idx");
		op.add(Builder::filter, JsonpDeserializer.stringDeserializer(), "filter", "f", "fi");
		op.add(Builder::routingIndex, JsonpDeserializer.stringDeserializer(), "routing.index", "ri", "routingIndex");
		op.add(Builder::routingSearch, JsonpDeserializer.stringDeserializer(), "routing.search", "rs", "routingSearch");
		op.add(Builder::isWriteIndex, JsonpDeserializer.stringDeserializer(), "is_write_index", "w", "isWriteIndex");

	}

}
