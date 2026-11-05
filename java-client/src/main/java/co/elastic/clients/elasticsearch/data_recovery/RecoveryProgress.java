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

package co.elastic.clients.elasticsearch.data_recovery;

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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: data_recovery._types.RecoveryProgress

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery._types.RecoveryProgress">API
 *      specification</a>
 */
@JsonpDeserializable
public class RecoveryProgress implements JsonpSerializable {
	@Nullable
	private final Integer percentComplete;

	// ---------------------------------------------------------------------------------------------

	private RecoveryProgress(Builder builder) {

		this.percentComplete = builder.percentComplete;

	}

	public static RecoveryProgress of(Function<Builder, ObjectBuilder<RecoveryProgress>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The estimated percentage of the recovery that has completed, from
	 * <code>0</code> to <code>100</code>. It is omitted when the progress cannot
	 * currently be determined, for example before the recovery starts moving data.
	 * It is <code>100</code> once the recovery has completed.
	 * <p>
	 * API name: {@code percent_complete}
	 */
	@Nullable
	public final Integer percentComplete() {
		return this.percentComplete;
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

		if (this.percentComplete != null) {
			generator.writeKey("percent_complete");
			generator.write(this.percentComplete);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryProgress}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RecoveryProgress> {
		@Nullable
		private Integer percentComplete;

		public Builder() {
		}
		private Builder(RecoveryProgress instance) {
			this.percentComplete = instance.percentComplete;

		}
		/**
		 * The estimated percentage of the recovery that has completed, from
		 * <code>0</code> to <code>100</code>. It is omitted when the progress cannot
		 * currently be determined, for example before the recovery starts moving data.
		 * It is <code>100</code> once the recovery has completed.
		 * <p>
		 * API name: {@code percent_complete}
		 */
		public final Builder percentComplete(@Nullable Integer value) {
			this.percentComplete = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RecoveryProgress}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryProgress build() {
			_checkSingleUse();

			return new RecoveryProgress(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryProgress}
	 */
	public static final JsonpDeserializer<RecoveryProgress> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RecoveryProgress::setupRecoveryProgressDeserializer);

	protected static void setupRecoveryProgressDeserializer(ObjectDeserializer<RecoveryProgress.Builder> op) {

		op.add(Builder::percentComplete, JsonpDeserializer.integerDeserializer(), "percent_complete");

	}

}
