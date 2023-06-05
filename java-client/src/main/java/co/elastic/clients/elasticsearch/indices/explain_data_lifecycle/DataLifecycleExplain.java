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

package co.elastic.clients.elasticsearch.indices.explain_data_lifecycle;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.indices.DataLifecycleWithRollover;
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

// typedef: indices.explain_data_lifecycle.DataLifecycleExplain

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.explain_data_lifecycle.DataLifecycleExplain">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataLifecycleExplain implements JsonpSerializable {
	private final String index;

	private final boolean managedByDlm;

	@Nullable
	private final Long indexCreationDateMillis;

	@Nullable
	private final Time timeSinceIndexCreation;

	@Nullable
	private final Long rolloverDateMillis;

	@Nullable
	private final Time timeSinceRollover;

	@Nullable
	private final DataLifecycleWithRollover lifecycle;

	@Nullable
	private final Time generationTime;

	@Nullable
	private final String error;

	// ---------------------------------------------------------------------------------------------

	private DataLifecycleExplain(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.managedByDlm = ApiTypeHelper.requireNonNull(builder.managedByDlm, this, "managedByDlm");
		this.indexCreationDateMillis = builder.indexCreationDateMillis;
		this.timeSinceIndexCreation = builder.timeSinceIndexCreation;
		this.rolloverDateMillis = builder.rolloverDateMillis;
		this.timeSinceRollover = builder.timeSinceRollover;
		this.lifecycle = builder.lifecycle;
		this.generationTime = builder.generationTime;
		this.error = builder.error;

	}

	public static DataLifecycleExplain of(Function<Builder, ObjectBuilder<DataLifecycleExplain>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code managed_by_dlm}
	 */
	public final boolean managedByDlm() {
		return this.managedByDlm;
	}

	/**
	 * API name: {@code index_creation_date_millis}
	 */
	@Nullable
	public final Long indexCreationDateMillis() {
		return this.indexCreationDateMillis;
	}

	/**
	 * API name: {@code time_since_index_creation}
	 */
	@Nullable
	public final Time timeSinceIndexCreation() {
		return this.timeSinceIndexCreation;
	}

	/**
	 * API name: {@code rollover_date_millis}
	 */
	@Nullable
	public final Long rolloverDateMillis() {
		return this.rolloverDateMillis;
	}

	/**
	 * API name: {@code time_since_rollover}
	 */
	@Nullable
	public final Time timeSinceRollover() {
		return this.timeSinceRollover;
	}

	/**
	 * API name: {@code lifecycle}
	 */
	@Nullable
	public final DataLifecycleWithRollover lifecycle() {
		return this.lifecycle;
	}

	/**
	 * API name: {@code generation_time}
	 */
	@Nullable
	public final Time generationTime() {
		return this.generationTime;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final String error() {
		return this.error;
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

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("managed_by_dlm");
		generator.write(this.managedByDlm);

		if (this.indexCreationDateMillis != null) {
			generator.writeKey("index_creation_date_millis");
			generator.write(this.indexCreationDateMillis);

		}
		if (this.timeSinceIndexCreation != null) {
			generator.writeKey("time_since_index_creation");
			this.timeSinceIndexCreation.serialize(generator, mapper);

		}
		if (this.rolloverDateMillis != null) {
			generator.writeKey("rollover_date_millis");
			generator.write(this.rolloverDateMillis);

		}
		if (this.timeSinceRollover != null) {
			generator.writeKey("time_since_rollover");
			this.timeSinceRollover.serialize(generator, mapper);

		}
		if (this.lifecycle != null) {
			generator.writeKey("lifecycle");
			this.lifecycle.serialize(generator, mapper);

		}
		if (this.generationTime != null) {
			generator.writeKey("generation_time");
			this.generationTime.serialize(generator, mapper);

		}
		if (this.error != null) {
			generator.writeKey("error");
			generator.write(this.error);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataLifecycleExplain}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataLifecycleExplain> {
		private String index;

		private Boolean managedByDlm;

		@Nullable
		private Long indexCreationDateMillis;

		@Nullable
		private Time timeSinceIndexCreation;

		@Nullable
		private Long rolloverDateMillis;

		@Nullable
		private Time timeSinceRollover;

		@Nullable
		private DataLifecycleWithRollover lifecycle;

		@Nullable
		private Time generationTime;

		@Nullable
		private String error;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code managed_by_dlm}
		 */
		public final Builder managedByDlm(boolean value) {
			this.managedByDlm = value;
			return this;
		}

		/**
		 * API name: {@code index_creation_date_millis}
		 */
		public final Builder indexCreationDateMillis(@Nullable Long value) {
			this.indexCreationDateMillis = value;
			return this;
		}

		/**
		 * API name: {@code time_since_index_creation}
		 */
		public final Builder timeSinceIndexCreation(@Nullable Time value) {
			this.timeSinceIndexCreation = value;
			return this;
		}

		/**
		 * API name: {@code time_since_index_creation}
		 */
		public final Builder timeSinceIndexCreation(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeSinceIndexCreation(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code rollover_date_millis}
		 */
		public final Builder rolloverDateMillis(@Nullable Long value) {
			this.rolloverDateMillis = value;
			return this;
		}

		/**
		 * API name: {@code time_since_rollover}
		 */
		public final Builder timeSinceRollover(@Nullable Time value) {
			this.timeSinceRollover = value;
			return this;
		}

		/**
		 * API name: {@code time_since_rollover}
		 */
		public final Builder timeSinceRollover(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeSinceRollover(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(@Nullable DataLifecycleWithRollover value) {
			this.lifecycle = value;
			return this;
		}

		/**
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(
				Function<DataLifecycleWithRollover.Builder, ObjectBuilder<DataLifecycleWithRollover>> fn) {
			return this.lifecycle(fn.apply(new DataLifecycleWithRollover.Builder()).build());
		}

		/**
		 * API name: {@code generation_time}
		 */
		public final Builder generationTime(@Nullable Time value) {
			this.generationTime = value;
			return this;
		}

		/**
		 * API name: {@code generation_time}
		 */
		public final Builder generationTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.generationTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable String value) {
			this.error = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataLifecycleExplain}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataLifecycleExplain build() {
			_checkSingleUse();

			return new DataLifecycleExplain(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataLifecycleExplain}
	 */
	public static final JsonpDeserializer<DataLifecycleExplain> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataLifecycleExplain::setupDataLifecycleExplainDeserializer);

	protected static void setupDataLifecycleExplainDeserializer(ObjectDeserializer<DataLifecycleExplain.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::managedByDlm, JsonpDeserializer.booleanDeserializer(), "managed_by_dlm");
		op.add(Builder::indexCreationDateMillis, JsonpDeserializer.longDeserializer(), "index_creation_date_millis");
		op.add(Builder::timeSinceIndexCreation, Time._DESERIALIZER, "time_since_index_creation");
		op.add(Builder::rolloverDateMillis, JsonpDeserializer.longDeserializer(), "rollover_date_millis");
		op.add(Builder::timeSinceRollover, Time._DESERIALIZER, "time_since_rollover");
		op.add(Builder::lifecycle, DataLifecycleWithRollover._DESERIALIZER, "lifecycle");
		op.add(Builder::generationTime, Time._DESERIALIZER, "generation_time");
		op.add(Builder::error, JsonpDeserializer.stringDeserializer(), "error");

	}

}
