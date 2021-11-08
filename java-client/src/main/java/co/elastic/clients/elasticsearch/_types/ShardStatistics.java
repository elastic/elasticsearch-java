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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.ShardStatistics
@JsonpDeserializable
public class ShardStatistics implements JsonpSerializable {
	private final Number failed;

	private final Number successful;

	private final Number total;

	private final List<ShardFailure> failures;

	@Nullable
	private final Number skipped;

	// ---------------------------------------------------------------------------------------------

	private ShardStatistics(Builder builder) {

		this.failed = ModelTypeHelper.requireNonNull(builder.failed, this, "failed");
		this.successful = ModelTypeHelper.requireNonNull(builder.successful, this, "successful");
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");
		this.failures = ModelTypeHelper.unmodifiable(builder.failures);
		this.skipped = builder.skipped;

	}

	public static ShardStatistics of(Function<Builder, ObjectBuilder<ShardStatistics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code failed}
	 */
	public final Number failed() {
		return this.failed;
	}

	/**
	 * Required - API name: {@code successful}
	 */
	public final Number successful() {
		return this.successful;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final Number total() {
		return this.total;
	}

	/**
	 * API name: {@code failures}
	 */
	public final List<ShardFailure> failures() {
		return this.failures;
	}

	/**
	 * API name: {@code skipped}
	 */
	@Nullable
	public final Number skipped() {
		return this.skipped;
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

		generator.writeKey("failed");
		generator.write(this.failed.doubleValue());

		generator.writeKey("successful");
		generator.write(this.successful.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		if (ModelTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (ShardFailure item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.skipped != null) {
			generator.writeKey("skipped");
			generator.write(this.skipped.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStatistics}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardStatistics> {
		private Number failed;

		private Number successful;

		private Number total;

		@Nullable
		private List<ShardFailure> failures;

		@Nullable
		private Number skipped;

		/**
		 * Required - API name: {@code failed}
		 */
		public final Builder failed(Number value) {
			this.failed = value;
			return this;
		}

		/**
		 * Required - API name: {@code successful}
		 */
		public final Builder successful(Number value) {
			this.successful = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public final Builder failures(@Nullable List<ShardFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public final Builder failures(ShardFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		@SafeVarargs
		public final Builder failures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>>... fns) {
			this.failures = new ArrayList<>(fns.length);
			for (Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn : fns) {
				this.failures.add(fn.apply(new ShardFailure.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code skipped}
		 */
		public final Builder skipped(@Nullable Number value) {
			this.skipped = value;
			return this;
		}

		/**
		 * Builds a {@link ShardStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStatistics build() {
			_checkSingleUse();

			return new ShardStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardStatistics}
	 */
	public static final JsonpDeserializer<ShardStatistics> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardStatistics::setupShardStatisticsDeserializer, Builder::build);

	protected static void setupShardStatisticsDeserializer(DelegatingDeserializer<ShardStatistics.Builder> op) {

		op.add(Builder::failed, JsonpDeserializer.numberDeserializer(), "failed");
		op.add(Builder::successful, JsonpDeserializer.numberDeserializer(), "successful");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ShardFailure._DESERIALIZER), "failures");
		op.add(Builder::skipped, JsonpDeserializer.numberDeserializer(), "skipped");

	}

}
