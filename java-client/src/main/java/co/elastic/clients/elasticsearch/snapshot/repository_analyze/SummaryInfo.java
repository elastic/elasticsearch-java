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

package co.elastic.clients.elasticsearch.snapshot.repository_analyze;

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

// typedef: snapshot.repository_analyze.SummaryInfo

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#snapshot.repository_analyze.SummaryInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class SummaryInfo implements JsonpSerializable {
	private final ReadSummaryInfo read;

	private final WriteSummaryInfo write;

	// ---------------------------------------------------------------------------------------------

	private SummaryInfo(Builder builder) {

		this.read = ApiTypeHelper.requireNonNullWithDefault(builder.read, this, "read", this.read());
		this.write = ApiTypeHelper.requireNonNullWithDefault(builder.write, this, "write", this.write());

	}

	public static SummaryInfo of(Function<Builder, ObjectBuilder<SummaryInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A collection of statistics that summarise the results of the read
	 * operations in the test.
	 * <p>
	 * API name: {@code read}
	 */
	public final ReadSummaryInfo read() {
		return this.read;
	}

	/**
	 * Required - A collection of statistics that summarise the results of the write
	 * operations in the test.
	 * <p>
	 * API name: {@code write}
	 */
	public final WriteSummaryInfo write() {
		return this.write;
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

		generator.writeKey("read");
		this.read.serialize(generator, mapper);

		generator.writeKey("write");
		this.write.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SummaryInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SummaryInfo> {
		private ReadSummaryInfo read;

		private WriteSummaryInfo write;

		/**
		 * Required - A collection of statistics that summarise the results of the read
		 * operations in the test.
		 * <p>
		 * API name: {@code read}
		 */
		public final Builder read(ReadSummaryInfo value) {
			this.read = value;
			return this;
		}

		/**
		 * Required - A collection of statistics that summarise the results of the read
		 * operations in the test.
		 * <p>
		 * API name: {@code read}
		 */
		public final Builder read(Function<ReadSummaryInfo.Builder, ObjectBuilder<ReadSummaryInfo>> fn) {
			return this.read(fn.apply(new ReadSummaryInfo.Builder()).build());
		}

		/**
		 * Required - A collection of statistics that summarise the results of the write
		 * operations in the test.
		 * <p>
		 * API name: {@code write}
		 */
		public final Builder write(WriteSummaryInfo value) {
			this.write = value;
			return this;
		}

		/**
		 * Required - A collection of statistics that summarise the results of the write
		 * operations in the test.
		 * <p>
		 * API name: {@code write}
		 */
		public final Builder write(Function<WriteSummaryInfo.Builder, ObjectBuilder<WriteSummaryInfo>> fn) {
			return this.write(fn.apply(new WriteSummaryInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SummaryInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SummaryInfo build() {
			_checkSingleUse();

			return new SummaryInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SummaryInfo}
	 */
	public static final JsonpDeserializer<SummaryInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SummaryInfo::setupSummaryInfoDeserializer);

	protected static void setupSummaryInfoDeserializer(ObjectDeserializer<SummaryInfo.Builder> op) {

		op.add(Builder::read, ReadSummaryInfo._DESERIALIZER, "read");
		op.add(Builder::write, WriteSummaryInfo._DESERIALIZER, "write");

	}

}
