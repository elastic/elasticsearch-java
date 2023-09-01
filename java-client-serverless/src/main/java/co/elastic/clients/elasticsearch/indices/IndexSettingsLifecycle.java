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

package co.elastic.clients.elasticsearch.indices;

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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettingsLifecycle

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.IndexSettingsLifecycle">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexSettingsLifecycle implements JsonpSerializable {
	private final String name;

	@Nullable
	private final Boolean indexingComplete;

	@Nullable
	private final Long originationDate;

	@Nullable
	private final Boolean parseOriginationDate;

	@Nullable
	private final IndexSettingsLifecycleStep step;

	@Nullable
	private final String rolloverAlias;

	// ---------------------------------------------------------------------------------------------

	private IndexSettingsLifecycle(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.indexingComplete = builder.indexingComplete;
		this.originationDate = builder.originationDate;
		this.parseOriginationDate = builder.parseOriginationDate;
		this.step = builder.step;
		this.rolloverAlias = builder.rolloverAlias;

	}

	public static IndexSettingsLifecycle of(Function<Builder, ObjectBuilder<IndexSettingsLifecycle>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the policy to use to manage the index. For information
	 * about how Elasticsearch applies policy changes, see Policy updates.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Indicates whether or not the index has been rolled over. Automatically set to
	 * true when ILM completes the rollover action. You can explicitly set it to
	 * skip rollover.
	 * <p>
	 * API name: {@code indexing_complete}
	 */
	@Nullable
	public final Boolean indexingComplete() {
		return this.indexingComplete;
	}

	/**
	 * If specified, this is the timestamp used to calculate the index age for its
	 * phase transitions. Use this setting if you create a new index that contains
	 * old data and want to use the original creation date to calculate the index
	 * age. Specified as a Unix epoch value in milliseconds.
	 * <p>
	 * API name: {@code origination_date}
	 */
	@Nullable
	public final Long originationDate() {
		return this.originationDate;
	}

	/**
	 * Set to true to parse the origination date from the index name. This
	 * origination date is used to calculate the index age for its phase
	 * transitions. The index name must match the pattern ^.*-{date_format}-\d+,
	 * where the date_format is yyyy.MM.dd and the trailing digits are optional. An
	 * index that was rolled over would normally match the full format, for example
	 * logs-2016.10.31-000002). If the index name doesn’t match the pattern, index
	 * creation fails.
	 * <p>
	 * API name: {@code parse_origination_date}
	 */
	@Nullable
	public final Boolean parseOriginationDate() {
		return this.parseOriginationDate;
	}

	/**
	 * API name: {@code step}
	 */
	@Nullable
	public final IndexSettingsLifecycleStep step() {
		return this.step;
	}

	/**
	 * The index alias to update when the index rolls over. Specify when using a
	 * policy that contains a rollover action. When the index rolls over, the alias
	 * is updated to reflect that the index is no longer the write index. For more
	 * information about rolling indices, see Rollover.
	 * <p>
	 * API name: {@code rollover_alias}
	 */
	@Nullable
	public final String rolloverAlias() {
		return this.rolloverAlias;
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

		generator.writeKey("name");
		generator.write(this.name);

		if (this.indexingComplete != null) {
			generator.writeKey("indexing_complete");
			generator.write(this.indexingComplete);

		}
		if (this.originationDate != null) {
			generator.writeKey("origination_date");
			generator.write(this.originationDate);

		}
		if (this.parseOriginationDate != null) {
			generator.writeKey("parse_origination_date");
			generator.write(this.parseOriginationDate);

		}
		if (this.step != null) {
			generator.writeKey("step");
			this.step.serialize(generator, mapper);

		}
		if (this.rolloverAlias != null) {
			generator.writeKey("rollover_alias");
			generator.write(this.rolloverAlias);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingsLifecycle}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexSettingsLifecycle> {
		private String name;

		@Nullable
		private Boolean indexingComplete;

		@Nullable
		private Long originationDate;

		@Nullable
		private Boolean parseOriginationDate;

		@Nullable
		private IndexSettingsLifecycleStep step;

		@Nullable
		private String rolloverAlias;

		/**
		 * Required - The name of the policy to use to manage the index. For information
		 * about how Elasticsearch applies policy changes, see Policy updates.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Indicates whether or not the index has been rolled over. Automatically set to
		 * true when ILM completes the rollover action. You can explicitly set it to
		 * skip rollover.
		 * <p>
		 * API name: {@code indexing_complete}
		 */
		public final Builder indexingComplete(@Nullable Boolean value) {
			this.indexingComplete = value;
			return this;
		}

		/**
		 * If specified, this is the timestamp used to calculate the index age for its
		 * phase transitions. Use this setting if you create a new index that contains
		 * old data and want to use the original creation date to calculate the index
		 * age. Specified as a Unix epoch value in milliseconds.
		 * <p>
		 * API name: {@code origination_date}
		 */
		public final Builder originationDate(@Nullable Long value) {
			this.originationDate = value;
			return this;
		}

		/**
		 * Set to true to parse the origination date from the index name. This
		 * origination date is used to calculate the index age for its phase
		 * transitions. The index name must match the pattern ^.*-{date_format}-\d+,
		 * where the date_format is yyyy.MM.dd and the trailing digits are optional. An
		 * index that was rolled over would normally match the full format, for example
		 * logs-2016.10.31-000002). If the index name doesn’t match the pattern, index
		 * creation fails.
		 * <p>
		 * API name: {@code parse_origination_date}
		 */
		public final Builder parseOriginationDate(@Nullable Boolean value) {
			this.parseOriginationDate = value;
			return this;
		}

		/**
		 * API name: {@code step}
		 */
		public final Builder step(@Nullable IndexSettingsLifecycleStep value) {
			this.step = value;
			return this;
		}

		/**
		 * API name: {@code step}
		 */
		public final Builder step(
				Function<IndexSettingsLifecycleStep.Builder, ObjectBuilder<IndexSettingsLifecycleStep>> fn) {
			return this.step(fn.apply(new IndexSettingsLifecycleStep.Builder()).build());
		}

		/**
		 * The index alias to update when the index rolls over. Specify when using a
		 * policy that contains a rollover action. When the index rolls over, the alias
		 * is updated to reflect that the index is no longer the write index. For more
		 * information about rolling indices, see Rollover.
		 * <p>
		 * API name: {@code rollover_alias}
		 */
		public final Builder rolloverAlias(@Nullable String value) {
			this.rolloverAlias = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexSettingsLifecycle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingsLifecycle build() {
			_checkSingleUse();

			return new IndexSettingsLifecycle(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexSettingsLifecycle}
	 */
	public static final JsonpDeserializer<IndexSettingsLifecycle> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexSettingsLifecycle::setupIndexSettingsLifecycleDeserializer);

	protected static void setupIndexSettingsLifecycleDeserializer(
			ObjectDeserializer<IndexSettingsLifecycle.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::indexingComplete, JsonpDeserializer.booleanDeserializer(), "indexing_complete");
		op.add(Builder::originationDate, JsonpDeserializer.longDeserializer(), "origination_date");
		op.add(Builder::parseOriginationDate, JsonpDeserializer.booleanDeserializer(), "parse_origination_date");
		op.add(Builder::step, IndexSettingsLifecycleStep._DESERIALIZER, "step");
		op.add(Builder::rolloverAlias, JsonpDeserializer.stringDeserializer(), "rollover_alias");

	}

}
